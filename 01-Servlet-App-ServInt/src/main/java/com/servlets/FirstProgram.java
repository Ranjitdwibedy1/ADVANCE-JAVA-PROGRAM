package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {
	
	ServletConfig con;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init method called");
        con = config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method called");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome to Servlet</h1>");
        out.println("<p>Today: " + new Date() + "</p>");
        out.println("</body></html>");
        System.out.println(getServletConfig());
        System.out.println(getServletInfo());
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method called");
    }

    @Override
    public ServletConfig getServletConfig() {
        return con;
    }

    @Override
    public String getServletInfo() {
        return "My first program";
    }
}
