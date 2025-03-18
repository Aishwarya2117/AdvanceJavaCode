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
		
		String Name1=req.getParameter("name1");
		String Email1=req.getParameter("email1");
		System.out.println("Name:"+Name1);
		System.out.println("Email:"+Email1);
		PrintWriter out=resp.getWriter();
		out.print("Name:"+Name1);
		out.print("\nEmail:"+Email1);
		
		
	}
}
