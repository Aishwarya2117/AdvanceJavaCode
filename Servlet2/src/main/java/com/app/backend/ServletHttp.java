package com.app.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHttp  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		//System.out.println("I m in doGet() method");
		resp.setContentType("text/html");
		resp.getWriter().println("<h2>Hello! This is a GET response fromMyServlet.</h2>");
		
	}
	@Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out =response.getWriter();
	        out.print("i m in do method for browser");
	        //("<h2>Hello! This is a POST response from MyServlet.</h2>");
	    }
}
