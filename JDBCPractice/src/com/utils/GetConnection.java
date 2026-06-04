package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.constants.Constants;


public class GetConnection {

	public static Connection getConnections() {
		try {
			return DriverManager.getConnection(Constants.url,Constants.username,Constants.password);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static Statement getStatements() {
		try {
			return getConnections().createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public static PreparedStatement preparedStatements(String query) {
		try {
			return getConnections().prepareStatement(query);
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
