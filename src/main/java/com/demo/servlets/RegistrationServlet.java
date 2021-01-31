package com.demo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.entities.Register;
import com.demo.models.RegisterModel;

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
			request.setAttribute("msg", "Sign Up Complete,Log in to continue.. <a href=\\\"/login.jsp\\\">Log In</a> ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Registration Failed");
		}
		request.getRequestDispatcher("registration.jsp").forward(request, response);
	}

}
