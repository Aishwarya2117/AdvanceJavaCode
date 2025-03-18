package coma.pp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aaa")

public class MyServlet extends HttpServlet {

	public MyServlet(){
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		String search=req.getParameter("Search");
		
		//resp.sendRedirect("http://www.google.com");
		
		//to direct page
		if(search !=null)
		resp.sendRedirect("http://www.google.com/search?q="+search);
		
	}
}
