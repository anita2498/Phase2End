package com.demo.models;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.entities.Register;

public class RegisterModel {

	protected static Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

	// Function to save register details obtained from user to the database.
	@SuppressWarnings("deprecation")
	public boolean update(Register userRegister) {
		boolean result = true;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.getSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.saveOrUpdate(userRegister);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			result = false;
		}
		return result;
	}

	// Function to search the database for existing elements with the credentials
	// entered by the user.
	public static Register find(String userid) {
		sessionFactory = HibernateUtil.getSessionFactory().openSession();
		sessionFactory.beginTransaction();
		// Hibernate Query
		Register u = (Register) ((Session) sessionFactory).createQuery("FROM Register R WHERE R.email= :email")
				.setParameter("email", userid).uniqueResult();
		return u; // returns the information.
	}

	// Function to validate the userid and password entered by the user.
	public static boolean validate(String userid, String pwd) {
		Register u = RegisterModel.find(userid);
		if (u != null) {
			if (u.getPwd().equals(pwd)) {
				return true;
			}
		}
		return false;
	}

}
