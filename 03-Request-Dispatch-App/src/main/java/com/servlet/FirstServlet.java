package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String em = req.getParameter("em");
		String pwd = req.getParameter("pwd");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		
		RequestDispatcher rd;
		
		if("demo@gmail.com".equals(em) && "demo".equals(pwd))
		{
			//home page redirect
			rd = req.getRequestDispatcher("/servlet2");
			rd.forward(req,resp);
		}else {
			//redirect login page
			out.print("<h4>Invalid email and password<h4>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req,resp);

			
		}
	
	}
	

}
