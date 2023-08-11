package com.xworkz.interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteInterview {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kr", "root", "root");
		System.out.println("Connection established");
		String query = "DELETE FROM interview WHERE id=3";

		Statement state = con.createStatement();
		int rowAffected = state.executeUpdate(query);
		if (rowAffected > 0) {
			System.out.println(rowAffected + " row deleted");
		} else {
			System.out.println("No rows deleted");
		}
		state.close();
		con.close();
	}
}
