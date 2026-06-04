package com.jdbc.connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.utils.GetConnection;

public class CallableStatementDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = GetConnection.getConnections();
		//CallbleStatement 
//		CallableStatement stmt = con.prepareCall("{call insertValues1(?,?,?)}");
//		stmt.setInt(1,20);
//		stmt.setString(2, "Ramesh");
//		stmt.setString(3, "KDD");
//		stmt.execute();
//		System.out.println("Inserted ...........");
		//Callable statement or OUT param sored procedure
//		CallableStatement stmt = con.prepareCall("{call getName3(?,?)}");
//		stmt.setString(1,"JPT");
//		stmt.registerOutParameter(2, Types.VARCHAR);
//		stmt.execute();
//		System.out.println(stmt.getString(2));
		//Callable statement or INOUT param stored procedure
//		CallableStatement stmt = con.prepareCall("{call getName5(?)}");
//		stmt.setString(1, "Ram");
//		stmt.registerOutParameter(1, Types.VARCHAR);
//		stmt.execute();
//		System.out.println(stmt.getString(1));
		//Callable statement or multiple coumn access
		CallableStatement stmt = con.prepareCall("{call getName9(?)}");
		stmt.setString(1, "JPT");
		ResultSet rs = stmt.executeQuery();
		System.out.println(rs);
		while(rs.next()) {
			System.out.println(rs.getInt("rollno"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("address"));
		}
	}

}
