package com.xworkz.ganeshfest.repository;

import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.ganeshfest.dto.GaneshDTO;
import com.xworkz.ganeshfest.util.JdbcUtil;

public class GaneshRepoImpl implements GaneshRepoInter {

	@Override
	public boolean onSave(GaneshDTO dto) throws SQLException {
		System.out.println("Invoked onSave method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String insertQuery = "INSERT INTO ganesh_fest VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		System.out.println("Before: " + ps);
		ps.setInt(1, dto.getId());
		ps.setFloat(2, dto.getGaneshHeight());
		ps.setInt(3, dto.getGaneshWeight());
		ps.setString(4, dto.getArea());
		ps.setString(5, dto.getPrasada());
		ps.setBoolean(6, dto.isPermissionGranted());
		ps.setInt(7, dto.getNoOfDays());
		ps.setString(8, dto.getPoojariName());
		System.out.println("After: " + ps);
		int rowInserted = ps.executeUpdate();
		if (rowInserted > 0) {
			System.out.println(rowInserted + " row inserted");
			con.close();
			ps.close();
			return true;
		} else {
			System.out.println("No row inserted");
			return false;
		}
	}

	@Override
	public boolean onUpdate(int id, String newPoojariName) throws SQLException {
		System.out.println("Invoked onUpdate method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String updateQuery = "UPDATE ganesh_fest SET poojari_name=? WHERE id=?";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		System.out.println("Before: " + ps);
		ps.setString(1, newPoojariName);
		ps.setInt(2, id);
		System.out.println("After: " + ps);
		int rowUpdated = ps.executeUpdate();
		if (rowUpdated > 0) {
			System.out.println(rowUpdated + " row updated");
			return true;
		} else {
			System.out.println("No row updated");
			return false;
		}
	}

	@Override
	public boolean onUpdate(String newPrasada, String poojariName) throws SQLException {
		System.out.println("Invoked onUpdate method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String updateQuery = "UPDATE ganesh_fest SET prasada=? WHERE poojari_name=?";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		System.out.println("Before: " + ps);
		ps.setString(1, newPrasada);
		ps.setString(2, poojariName);
		System.out.println("After: " + ps);
		int rowUpdated = ps.executeUpdate();
		if (rowUpdated > 0) {
			System.out.println(rowUpdated + " row updated");
			return true;
		} else {
			System.out.println("No row updated");
			return false;
		}
	}

	@Override
	public boolean onUpdate(String area, boolean permissionGranted) throws SQLException {
		System.out.println("Invoked onUpdate method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String updateQuery = "UPDATE ganesh_fest SET permission_granted=? WHERE area=?";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		System.out.println("Before: " + ps);
		ps.setBoolean(1, permissionGranted);
		ps.setString(2, area);
		System.out.println("After: " + ps);
		int rowUpdated = ps.executeUpdate();
		if (rowUpdated > 0) {
			System.out.println(rowUpdated + " row updated");
			return true;
		} else {
			System.out.println("No row updated");
			return false;
		}
	}

	@Override
	public boolean onUpdate(int id, float ganeshHeight, int ganeshWeight, String area, String prasada,
			boolean permissionGranted, int noOfDays, String poojariName) throws SQLException {
		System.out.println("Invoked onUpdate method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String updateQuery = "UPDATE ganesh_fest SET ganesh_height=?, ganesh_weight=?, area=?, prasada=?, permission_granted=?, no_of_days=?, poojari_name=? WHERE id=?";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		System.out.println("Before: " + ps);
		ps.setFloat(1, ganeshHeight);
		ps.setInt(2, ganeshWeight);
		ps.setString(3, area);
		ps.setString(4, prasada);
		ps.setBoolean(5, permissionGranted);
		ps.setInt(6, noOfDays);
		ps.setString(7, poojariName);
		ps.setInt(8, id);
		System.out.println("After: " + ps);
		int rowUpdated = ps.executeUpdate();
		if (rowUpdated > 0) {
			System.out.println(rowUpdated + " row updated");
			return true;
		} else {
			System.out.println("No row updated");
			return false;
		}
	}

	@Override
	public boolean onDelete(int id) throws SQLException {
		System.out.println("Invoked onDelete method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String deleteQuery = "DELETE FROM ganesh_fest WHERE id=?";
		PreparedStatement ps = con.prepareStatement(deleteQuery);
		System.out.println("Before: " + ps);
		ps.setInt(1, id);
		System.out.println("After: " + ps);
		int rowDeleted = ps.executeUpdate();
		if (rowDeleted > 0) {
			System.out.println(rowDeleted + " row deleted");
			return true;
		} else {
			System.out.println("No row deleted");
			return false;
		}
	}

	@Override
	public boolean readAll() throws SQLException {
		System.out.println("Invoked readAll method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String readQuery = "SELECT * from ganesh_fest";
		PreparedStatement ps = con.prepareStatement(readQuery);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1));
			System.out.println("GaneshHeight: " + rs.getFloat(2));
			System.out.println("GaneshWeight: " + rs.getInt(3));
			System.out.println("Area: " + rs.getString(4));
			System.out.println("Prasada: " + rs.getString(5));
			System.out.println("PermissionGranted: " + rs.getBoolean(6));
			System.out.println("NoOfDays: " + rs.getInt(7));
			System.out.println("PoojariName: " + rs.getString(8));
		}
		return true;
	}

	@Override
	public boolean searchById(int id) throws SQLException {
		System.out.println("Invoked searchById method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String readQuery = "SELECT * FROM ganesh_fest WHERE id=?";
		PreparedStatement ps = con.prepareStatement(readQuery);
		ps.setInt(1, id);
		System.out.println("Id: " + id);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1));
			System.out.println("GaneshHeight: " + rs.getFloat(2));
			System.out.println("GaneshWeight: " + rs.getInt(3));
			System.out.println("Area: " + rs.getString(4));
			System.out.println("Prasada: " + rs.getString(5));
			System.out.println("PermissionGranted: " + rs.getBoolean(6));
			System.out.println("NoOfDays: " + rs.getInt(7));
			System.out.println("PoojariName: " + rs.getString(8));
		}
		return true;
	}

	@Override
	public boolean searchByArea(String area) throws SQLException {
		System.out.println("Invoked searchByArea method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String readQuery = "SELECT * FROM ganesh_fest WHERE area=?";
		PreparedStatement ps = con.prepareStatement(readQuery);
		ps.setString(1, area);
		System.out.println("Area name: " + area);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1));
			System.out.println("GaneshHeight: " + rs.getFloat(2));
			System.out.println("GaneshWeight: " + rs.getInt(3));
			System.out.println("Area: " + rs.getString(4));
			System.out.println("Prasada: " + rs.getString(5));
			System.out.println("PermissionGranted: " + rs.getBoolean(6));
			System.out.println("NoOfDays: " + rs.getInt(7));
			System.out.println("PoojariName: " + rs.getString(8));
		}
		return true;
	}

	@Override
	public boolean searchByPrasada(String prasada) throws SQLException {
		System.out.println("Invoked searchByPrasada method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String readQuery = "SELECT * FROM ganesh_fest WHERE prasada=?";
		PreparedStatement ps = con.prepareStatement(readQuery);
		ps.setString(1, prasada);
		System.out.println("Prasada name: " + prasada);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1));
			System.out.println("GaneshHeight: " + rs.getFloat(2));
			System.out.println("GaneshWeight: " + rs.getInt(3));
			System.out.println("Area: " + rs.getString(4));
			System.out.println("Prasada: " + rs.getString(5));
			System.out.println("PermissionGranted: " + rs.getBoolean(6));
			System.out.println("NoOfDays: " + rs.getInt(7));
			System.out.println("PoojariName: " + rs.getString(8));
		}
		return true;
	}

	@Override
	public void writeToExcel() throws SQLException, IOException {
		System.out.println("Invoked writeToExcel method");
		Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.username, JdbcUtil.password);
		String readQuery = "SELECT * FROM ganesh_fest";
		PreparedStatement ps = con.prepareStatement(readQuery);
		ResultSet rs = ps.executeQuery();

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Ganesh Festival Data");

		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("id");
		row.createCell(1).setCellValue("ganesh_height");
		row.createCell(2).setCellValue("ganesh_weight");
		row.createCell(3).setCellValue("area");
		row.createCell(4).setCellValue("prasada");
		row.createCell(5).setCellValue("permission_granted");
		row.createCell(6).setCellValue("no_of_days");
		row.createCell(7).setCellValue("poojari_name");

		int r = 1;
		while (rs.next()) {
			int id = rs.getInt(1);
			float ganeshHeight = rs.getFloat(2);
			int ganeshWeight = rs.getInt(3);
			String area = rs.getString(4);
			String prasada = rs.getString(5);
			boolean permissionGranted = rs.getBoolean(6);
			int noOfDays = rs.getInt(7);
			String poojariName = rs.getString(8);

			row = sheet.createRow(r++);
			row.createCell(0).setCellValue(id);
			row.createCell(1).setCellValue(ganeshHeight);
			row.createCell(2).setCellValue(ganeshWeight);
			row.createCell(3).setCellValue(area);
			row.createCell(4).setCellValue(prasada);
			row.createCell(5).setCellValue(permissionGranted);
			row.createCell(6).setCellValue(noOfDays);
			row.createCell(7).setCellValue(poojariName);
		}
		FileOutputStream file = new FileOutputStream("E:\\ganesh.xlsx");
		workbook.write(file);

		workbook.close();
		file.close();
		con.close();
		rs.close();
		ps.close();
		System.out.println("Success!");
	}
}
