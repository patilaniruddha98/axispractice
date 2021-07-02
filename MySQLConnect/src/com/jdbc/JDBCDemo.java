package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/mycity";
	static final String USERNAME = "root";
	static final String PASSWORD = "admin";
	
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("connected to database");
			
			String query = "insert into city(id,cname) value(?,?)";
			PreparedStatement ptst =connection.prepareStatement(query);
			ptst.setInt(1, 1);
			ptst.setString(2, "Mumbai");
			ptst.executeUpdate();
			System.out.println("inserted");
			connection.close();
			
			
		}catch(Exception e) {
			System.out.println("error in connection");
			e.printStackTrace();
		}
	}
	

}
