package com.demo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.models.RegisterModel;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if ((RegisterModel.validate(request.getParameter("email"), request.getParameter("Password")))) {
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Login Failed");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}

	}

}
