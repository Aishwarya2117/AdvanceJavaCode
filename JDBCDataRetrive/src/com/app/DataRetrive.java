package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataRetrive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Aishwarya@2001");
      PreparedStatement ps=con.prepareStatement("SELECT *FROM register");

     ResultSet rs= ps.executeQuery();
      
     while(rs.next()) {
    	 String name1=rs.getString("name");
    	 System.out.println(name1);
          // System.out.println(rs.getString("name"));
     }
	}

}
