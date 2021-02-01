package com.demo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.models.RegisterModel;

//Servlet mapping is done from web.xml
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
		// validates the userid and password entered and redirects to the welcome page
		// of the application.
		if ((RegisterModel.validate(request.getParameter("email"), request.getParameter("Password")))) {
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			// If the credentials entered does not match the database values, gives the
			// message and redirects to the same page for login.
			request.setAttribute("msg",
					"<div style=\"border:1px dotted red;padding:2%;\">" + "Invalid user Credentials</div>");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
