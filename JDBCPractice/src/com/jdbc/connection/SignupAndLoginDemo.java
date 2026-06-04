package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SignupAndLoginDemo {

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
			System.out.println("Enter your name");
			String name = sc.nextLine();
			String sql = "insert into users(name,username,password) values('" + name + "','" + userName + "','" + passWord + "')";
			stmt.executeUpdate(sql);
			System.out.println("Signup process sucessully completed");
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
