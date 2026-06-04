package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class LoginDemo {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				String username = "root";
				String password = "root";
				String url = "jdbc:mysql://localhost:3307/lavanyadb";
				Connection connection = DriverManager.getConnection(url, username, password);
				System.out.println("Connection Created");
				Statement stmt = connection.createStatement();
				System.out.println("Enter username");
				Scanner sc = new Scanner(System.in);
				String userName = sc.nextLine();
				System.out.println("Enter password");
				String passWord = sc.nextLine();
				//SignUp logic or registration logic
//				System.out.println("Enter your name");
//				String name = sc.nextLine();
//				String sql = "insert into users(name,username,password) values('" + name + "','" + userName + "','" + passWord + "')";
//				stmt.executeUpdate(sql);
//				System.out.println("Signup process sucessully completed");
				//login logic
//				String sql = "SELECT * FROM users WHERE username='" + userName + "' AND password='" + passWord + "'";
//				ResultSet rs = stmt.executeQuery(sql);
//				if(rs.next()) {
//					System.out.println("Login successful");
//				}else {
//					System.out.println("login failed");
//				}
				//login and password checking logic
				String sql = "SELECT * FROM users WHERE username='" + userName + "'";
				ResultSet rs = stmt.executeQuery(sql);
				//meta data about table like table description
				ResultSetMetaData metadata = rs.getMetaData();
				System.out.println(metadata.getColumnCount());
				System.out.println(metadata.getColumnTypeName(1));
				if(rs.next()){
					if(rs.getString("password").equals(passWord)) {
						System.out.println("login sucecessful");
					}else {
						System.out.println("Invalid password");
					}		
				}else {
					System.out.println("Invalid username");
				}
			}catch(Exception e) {
				System.out.println(e);
			}

	}

}
