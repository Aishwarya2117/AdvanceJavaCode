package coma.pp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcher extends HttpServlet {
	
	public RequestDispatcher() {
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		String email=req.getParameter("Email");
		String pass=req.getParameter("Password");
		
		if(email !=null && pass !=null && email.equals("Aish11@gmail.com") && pass.equals("Aish@11")) {
		
			javax.servlet.RequestDispatcher rd=req.getRequestDispatcher("/Profile.jsp");
	        rd.forward(req,resp);
		}
		else
		{
			javax.servlet.RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		}
	}

}
