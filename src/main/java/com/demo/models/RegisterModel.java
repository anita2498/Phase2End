package com.demo.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.entities.Register;
import com.demo.models.HibernateUtil;

public class RegisterModel {

	protected static Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

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
		} finally {
			session.close();
		}
		return result;
	}

	public static Register find(String userid) {
		sessionFactory = HibernateUtil.getSessionFactory().openSession();
		sessionFactory.beginTransaction();
		Register u = (Register) ((Session) sessionFactory).createQuery("FROM Register R WHERE R.email= :email")
				.setParameter("email", userid).uniqueResult();
		sessionFactory.close();

		return u;

	}

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
