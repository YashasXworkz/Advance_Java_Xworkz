package com.xworkz.stackoverflow.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public static String url = "jdbc:mysql://localhost:3306/kr";
	public static String username = "root";
	public static String password = "root";

	static Connection con = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
