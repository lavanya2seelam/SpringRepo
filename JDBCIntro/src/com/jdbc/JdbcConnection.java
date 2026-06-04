package com.jdbc;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Beore  JDBC connection");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC connection done....");

	}

}
