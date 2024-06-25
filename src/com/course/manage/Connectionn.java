package com.course.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionn {
	// establish a connection to a database
	// driverclass, connection, -> url , username , password
	// query fire-> statement , preparedstat,-> select * from courses;
	// result set 
	static Connection con;
	public static Connection connector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			String url = "jdbc:mysql://localhost:3306/courses";
			String username = "root";
			String password = "Bijay@123";
			
			con = DriverManager.getConnection(url,username, password);
			
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
		
		
		
	}
	

}
