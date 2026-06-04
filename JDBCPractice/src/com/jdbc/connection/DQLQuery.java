package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DQLQuery {
	public static void main(String[] args) throws SQLException {
		System.out.println("Beore connection");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("connection established");
			//url,username,password
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3307/lavanyadb";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Created");
			Statement stmt = connection.createStatement();
			//we can use execute update methode or DML commands
			String sql = "select * FROM lavanya;";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//data with columns numbers
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				String address = rs.getString(3);
				//Data with column names
				int id = rs.getInt("rollno");
				String name = rs.getString("name");
				String address = rs.getString("address");
				System.out.println("id=  "+id+"   name =  "+name+"    address =  "+address);
			}
			System.out.println("data deleted");
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
