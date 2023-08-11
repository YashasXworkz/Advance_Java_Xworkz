package com.xworkz.krmarket;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class MarketRunner {
	public static void main(String[] args) {
		System.out.println("Invoked main method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Diver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kr", "root", "root");
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
