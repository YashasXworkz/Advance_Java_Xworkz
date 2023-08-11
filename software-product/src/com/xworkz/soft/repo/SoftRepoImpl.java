package com.xworkz.soft.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.soft.dto.SoftDTO;
import com.xworkz.soft.util.JDBCUtil;

public class SoftRepoImpl implements SoftRepo {

	@Override
	public boolean onSave(SoftDTO dto) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "INSERT INTO soft_ware VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setInt(1, dto.getId());
		ps.setString(2, dto.getUname());
		ps.setString(3, dto.getEmail());
		ps.setLong(4, dto.getPhone());
		ps.setFloat(5, dto.getVersion());
		ps.setString(6, dto.getDOE());
		ps.setString(7, dto.getPassword());
		ps.setInt(8, dto.getPrice());
		ps.setString(9, dto.getOsVersion());
		ps.setString(10, dto.getSoftName());
		System.out.println("After: " + ps);
		int row = ps.executeUpdate();
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean onSearch(Float proVersion) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "SELECT * FROM soft_ware WHERE version LIKE ?";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setFloat(1, proVersion);
		System.out.println("After: " + ps);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("username: " + rs.getString(2));
			System.out.println("email: " + rs.getString(3));
			System.out.println("phone: " + rs.getLong(4));
			System.out.println("version: " + rs.getFloat(5));
			System.out.println("doe: " + rs.getString(6));
			System.out.println("password: " + rs.getString(7));
			System.out.println("price: " + rs.getInt(8));
			System.out.println("os version: " + rs.getString(9));
			System.out.println("softname: " + rs.getString(10));
		}
		return true;
	}

	@Override
	public boolean onSearch(int id) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "SELECT * FROM soft_ware WHERE id=?";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setInt(1, id);
		System.out.println("After: " + ps);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("username: " + rs.getString(2));
			System.out.println("email: " + rs.getString(3));
			System.out.println("phone: " + rs.getLong(4));
			System.out.println("version: " + rs.getFloat(5));
			System.out.println("doe: " + rs.getString(6));
			System.out.println("password: " + rs.getString(7));
			System.out.println("price: " + rs.getInt(8));
			System.out.println("os version: " + rs.getString(9));
			System.out.println("softname: " + rs.getString(10));
		}
		return true;
	}

	@Override
	public boolean onSearch(String softname) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "SELECT * FROM soft_ware WHERE softName=?";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setString(1, softname);
		System.out.println("After: " + ps);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("username: " + rs.getString(2));
			System.out.println("email: " + rs.getString(3));
			System.out.println("phone: " + rs.getLong(4));
			System.out.println("version: " + rs.getFloat(5));
			System.out.println("doe: " + rs.getString(6));
			System.out.println("password: " + rs.getString(7));
			System.out.println("price: " + rs.getInt(8));
			System.out.println("os version: " + rs.getString(9));
			System.out.println("softname: " + rs.getString(10));
			System.out.println("------------------------------");
		}
		return true;
	}

	@Override
	public void onReadAll() throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "SELECT * FROM soft_ware";
		PreparedStatement ps = con.prepareStatement(q);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("username: " + rs.getString(2));
			System.out.println("email: " + rs.getString(3));
			System.out.println("phone: " + rs.getLong(4));
			System.out.println("version: " + rs.getFloat(5));
			System.out.println("doe: " + rs.getString(6));
			System.out.println("password: " + rs.getString(7));
			System.out.println("price: " + rs.getInt(8));
			System.out.println("os version: " + rs.getString(9));
			System.out.println("softname: " + rs.getString(10));
			System.out.println("------------------------------");
		}
	}

	@Override
	public boolean onUpdate(int id, SoftDTO dto) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "UPDATE soft_ware SET name=?, email=?, phone=?, version=?, doe=?, password=?,price=?,osVersion=?,softName=? WHERE id=?";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setString(1, dto.getUname());
		ps.setString(2, dto.getEmail());
		ps.setLong(3, dto.getPhone());
		ps.setFloat(4, dto.getVersion());
		ps.setString(5, dto.getDOE());
		ps.setString(6, dto.getPassword());
		ps.setInt(7, dto.getPrice());
		ps.setString(8, dto.getOsVersion());
		ps.setString(9, dto.getSoftName());
		ps.setInt(10, id);
		System.out.println("After: " + ps);
		int row = ps.executeUpdate();
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean onUpdate(int newPrice, float version) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "UPDATE soft_ware SET price=? WHERE version LIKE ?";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setFloat(1, newPrice);
		ps.setFloat(2, version);
		System.out.println("After: " + ps);
		int row = ps.executeUpdate();
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean onDelete(String softname) throws SQLException {
		Connection con = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.pass);
		String q = "DELETE FROM soft_ware WHERE softName=?";
		PreparedStatement ps = con.prepareStatement(q);
		System.out.println("Before: " + ps);
		ps.setString(1, softname);
		System.out.println("After: " + ps);
		int row = ps.executeUpdate();
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}
}
