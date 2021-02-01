package com.demo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.entities.Register;
import com.demo.models.RegisterModel;

//Servlet mapping is done from web.xml
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegisterModel registerModel = new RegisterModel();
		Register registerObj = new Register();
		registerObj.setFirstname(request.getParameter("First_Name"));
		registerObj.setMiddlename(request.getParameter("Middle_Name"));
		registerObj.setLastname(request.getParameter("Last_Name"));
		registerObj.setEmail(request.getParameter("E-mail"));
		registerObj.setPwd(request.getParameter("Password"));

		if (registerModel.update(registerObj)) {
			// If the Registration is successful, takes the user to index page for login.
			request.setAttribute("msg",
					"<div style=\"border:1px dotted green;padding:2%;\">" + "Sign Up Complete,Log in to continue.. ");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			// If the userid already exists, gives the error message and redirects to the
			// registration page for new account creation.
			request.setAttribute("msg", "<div style=\"border:1px dotted red;padding:2%;\">"
					+ "Registration Failed, Username already exists");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
	}

}
