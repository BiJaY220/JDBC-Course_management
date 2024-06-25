package com.course.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseDao {

	public static boolean insertIntoDB(Courses cr) {
		// to insert data into database
		boolean f = false;
		try {
			Connection con = Connectionn.connector();
			String query = "insert into course(cname,duration,price) values(?,?,?);";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, cr.getCname());
			pstm.setString(2, cr.getDuration());
			pstm.setString(3, cr.getPrice());
			pstm.executeUpdate();
			con.close();
			f = true;
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}
	// class to run sql queries 

	public static boolean deleteData(int crid) {
		boolean f = false;
		try {
			Connection con = Connectionn.connector();
			String query = "delete from course where id=?;";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, crid);
			
			pstm.execute();
			con.close();
			f = true;
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		
		
		
		// TODO Auto-generated method stub
		
	}

	public static boolean showDetails() {
		boolean f = false;
		try {
			Connection con = Connectionn.connector();
			String query = "select * from course;";
			Statement stm = con.createStatement();
			ResultSet set = stm.executeQuery(query);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String duration = set.getString(3);
				String price = set.getString(4);
				
				System.out.println("ID :"+id);
				System.out.println("Name :"+name);
				System.out.println("Duration :"+duration);
				System.out.println("PRICE :"+price);
				System.out.println("---------------------------");
				
				
				
			}
			
			
			
			
			
			f = true;
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		// TODO Auto-generated method stub
		
	}
	
	
}
