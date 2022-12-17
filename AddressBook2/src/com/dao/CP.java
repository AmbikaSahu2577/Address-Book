package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
     static Connection con;
	public static Connection createC() throws ClassNotFoundException
	{
	   try 
	   {
		 //laod the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		// create the connection
			String user = "root";
			String url =  "jdbc:mysql://localhost:3306/address_book2";
			String password = "Ambik@24";
			con=DriverManager.getConnection(url, user, password);
			
	   } 
	   catch (Exception e) 
	   {
		e.printStackTrace();
	   }
		
		return con;
		
	}
}
