package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Driver {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//using variable name inserting data
		String name1="Sonali";	
		String email1="Sonali@26";
		String password1="Sonali@2022";
		String gender1="female";
		String city1="bangluru";
		
		
		
		
		//load and register driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver class loaded successfully");
      //create connection
      
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root","Aishwarya@2001");
      System.out.println("Successfully created connection");
      //PreparedStatement ps= con.prepareStatement("insert into register values('Aishwarya','Aish@17','Aish@123','female','pune')"); 
     
      //using variable
     // PreparedStatement ps= con.prepareStatement("insert into register values('"+name1+"','"+email1+"','"+password1+"','"+gender1+"','"+city1+"')"); 
      //using positional parameters
     PreparedStatement ps= con.prepareStatement("insert into register values(?,?,?,?,?)");
     ps.setString(1,name1);
     ps.setString(2,email1);
     ps.setString(3,password1);
     ps.setString(4,gender1);
     ps.setString(5,city1);
     
     int i= ps.executeUpdate();  
     if(i>0) {
    	  System.out.println("Success");
     }
     else
    	 System.out.println("fail");
	}

}
