package com.jdbc.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.utils.GetConnection;

public class PrepareStatementDemo {

	public static void main(String[] args) throws SQLException {
		String sql = "select * from users where username = ? and password = ?";
		PreparedStatement pstmt = GetConnection.preparedStatements(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			System.out.println("login sucessully");
		}else {
			System.out.println("Invalid username");
		}
		
	}

}
