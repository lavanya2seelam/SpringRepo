package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Beore connection");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connection established");
		//url,username,password
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3307/lavanyadb";
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Created");
		Statement stmt = connection.createStatement();
		//we can use execute update methode or DML commands
		String sql = "INSERT INTO lavanya values (11, 'Sneha', 'Hyderabad')";
		stmt.executeUpdate(sql);
		System.out.println("data inserted");

	}

}
