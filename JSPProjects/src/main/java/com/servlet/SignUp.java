package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Read values from form
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Store values in request object
        req.setAttribute("uname", username);
        req.setAttribute("pass", password);

        // Forward to JSP
        RequestDispatcher rd = req.getRequestDispatcher("servlet.jsp");

        rd.forward(req, resp);
	}

}
