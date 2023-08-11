package com.xworkz.interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInterview {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kr", "root", "root");
		System.out.println("Connection established");
		String query = "INSERT INTO interview VALUES(1, 'yashas', 'B.Sc', 'Java Dev'),(2, 'vinay', 'B.Sc', 'Web Dev'),(3, 'vineeth', 'B.Sc', 'SQL Dev')";

		Statement state = con.createStatement();
		int rowAffected = state.executeUpdate(query);
		if (rowAffected > 0) {
			System.out.println(rowAffected + " row inserted");
		} else {
			System.out.println("No rows inserted");
		}
		state.close();
		con.close();
	}
}
