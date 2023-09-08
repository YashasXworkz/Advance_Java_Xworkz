package com.xworkz.college.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(urlPatterns = "/read")
public class ReadServlet extends HttpServlet {
	CollegeService service = new CollegeServiceImpl();

	public ReadServlet() {
		System.out.println("Invoked ReadServlet constructor");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Invoked ReadServlet doGet method");
		res.setContentType("text/html");
		List<CollegeDto> data = service.readAll();
		PrintWriter writer = res.getWriter();
		writer.println("<table>");
		for (CollegeDto dto : data) {
			writer.println("<tr>");
			writer.println("<td>" + dto.getName() + "</td>");
			writer.println("<td>" + dto.getLocation() + "</td>");
			writer.println("<td>" + dto.getNoOfStudents() + "</td>");
			writer.println("<td>" + dto.getNoOfStaffs() + "</td>");
			writer.println("</tr>");
		}
		writer.println("</table>");
	}
}
