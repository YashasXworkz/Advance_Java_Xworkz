package com.xworkz.exceltest;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.sql.*;

public class ReadExcel {
  public static void main(String[] args) throws SQLException, IOException {
    Connection con = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.user, JdbcUtil.pass);
    
    FileInputStream excelFile = new FileInputStream("E:\\stack.xlsx");
    Workbook workbook = new XSSFWorkbook(excelFile);
    Sheet sheet = workbook.getSheetAt(0);
    
    int lastRowIdx = sheet.getLastRowNum();
    System.out.println(lastRowIdx);
    
    for (int rowIndex = 1; rowIndex <= lastRowIdx; rowIndex++) {
      Row row = sheet.getRow(rowIndex);

      String name = row.getCell(1).getStringCellValue();
      String email = row.getCell(2).getStringCellValue();
      long phoneNo = (long) row.getCell(3).getNumericCellValue();
      String address = row.getCell(4).getStringCellValue();
      int followers = (int) row.getCell(5).getNumericCellValue();
      int noOfQuesAns = (int) row.getCell(6).getNumericCellValue();
      int noOfQuesAsk = (int) row.getCell(7).getNumericCellValue();
      String badges = row.getCell(8).getStringCellValue();
      String skill = row.getCell(9).getStringCellValue();
      String memberSince = row.getCell(10).getStringCellValue();

      String insertQuery = "INSERT INTO stackoverflow (name, email, phone_no, address, followers, no_of_ques_ans, no_of_ques_ask, badges, skill, member_since) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(insertQuery);
      ps.setString(1, name);
      ps.setString(2, email);
      ps.setLong(3, phoneNo);
      ps.setString(4, address);
      ps.setInt(5, followers);
      ps.setInt(6, noOfQuesAns);
      ps.setInt(7, noOfQuesAsk);
      ps.setString(8, badges);
      ps.setString(9, skill);
      ps.setString(10, memberSince);
      ps.executeUpdate();
      ps.close();
    }

    con.close();
    workbook.close();
    excelFile.close();
    System.out.println("Success!");
  }
}
