package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
       Class.forName("com.mysql.cj.jdbc.Driver");
       String email1="Sonali@26";
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Aishwarya@2001");
       PreparedStatement ps= con.prepareStatement("delete from register where email=?");
      ps.setString(1 , email1);
       
      int count =ps.executeUpdate();
      if(count > 0) {
    	  System.out.println("Deleted successfully");
      }
      else 
    	  System.out.println("Failed");
	}

}
