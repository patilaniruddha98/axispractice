package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

		
		
		static final String DB_URL = "jdbc:mysql://localhost:3306/world";
		static final String USERNAME = "root";
		static final String PASSWORD = "admin";
		
		public static void main(String[] args) {
			Connection connection = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				System.out.println("connected to database");
			}catch(Exception e) {
				System.out.println("error in connection");
				e.printStackTrace();
			}
		}
		

	

}
