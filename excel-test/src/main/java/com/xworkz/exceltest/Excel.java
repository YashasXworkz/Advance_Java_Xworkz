package com.xworkz.exceltest;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.sql.*;

public class Excel {
  public static void main(String[] args) throws SQLException, IOException {
    Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.user, JdbcUtil.pass);
    String q = "SELECT * FROM stackoverflow";
    PreparedStatement ps = con.prepareStatement(q);
    ResultSet rs = ps.executeQuery();
    
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("DataSheet");
    Row row = sheet.createRow(0);
    row.createCell(0).setCellValue("id");
    row.createCell(1).setCellValue("name");
    row.createCell(2).setCellValue("email");
    row.createCell(3).setCellValue("phone_no");
    row.createCell(4).setCellValue("address");
    row.createCell(5).setCellValue("followers");
    row.createCell(6).setCellValue("no_of_ques_ans");
    row.createCell(7).setCellValue("no_of_ques_ask");
    row.createCell(8).setCellValue("badges");
    row.createCell(9).setCellValue("skill");
    row.createCell(10).setCellValue("member_since");
    
    int r = 1;
    while (rs.next()) {
      row = sheet.createRow(r++);
      row.createCell(0).setCellValue(rs.getInt(1));
      row.createCell(1).setCellValue(rs.getString(2));
      row.createCell(2).setCellValue(rs.getString(3));
      row.createCell(3).setCellValue(rs.getLong(4));
      row.createCell(4).setCellValue(rs.getString(5));
      row.createCell(5).setCellValue(rs.getInt(6));
      row.createCell(6).setCellValue(rs.getInt(7));
      row.createCell(7).setCellValue(rs.getInt(8));
      row.createCell(8).setCellValue(rs.getString(9));
      row.createCell(9).setCellValue(rs.getString(10));
      row.createCell(10).setCellValue(rs.getString(11));
    }
    
    FileOutputStream fos = new FileOutputStream("E:\\stack.xlsx");
    workbook.write(fos);
    
    rs.close();
    ps.close();
    con.close();
    workbook.close();
    System.out.println("Success!");
  }
}
