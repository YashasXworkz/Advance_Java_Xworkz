package com.xworkz.college.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(urlPatterns = "/CollegeServlet")
public class CollegeServlet extends HttpServlet {
	CollegeService service = new CollegeServiceImpl();

	public CollegeServlet() {
		System.out.println("Invoked CollegeServlet constructor");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Invoked CollegeServlet doGet method");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<style>");
		writer.println("input { padding: 10px; margin: 10px; }");
		writer.println("</style>");
		writer.println("<title>Create An Account for college</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<div style=\"text-align: center;\">");
		writer.println("<h1>Create An Account for college</h1>");
		writer.println("<form action=\"CollegeServlet\" method=\"post\">");
		writer.println("<div><input type=\"text\" name=\"name\" placeholder=\"Name\"></div>");
		writer.println("<div><input type=\"text\" name=\"location\" placeholder=\"Location\"></div>");
		writer.println("<div><input type=\"number\" name=\"noOfStudents\" placeholder=\"No of Students\"></div>");
		writer.println("<div><input type=\"number\" name=\"noOfStaffs\" placeholder=\"No of Staffs\"></div>");
		writer.println("<div><input type=\"submit\" value=\"Create Account\"></div>");
		writer.println("</form>");
		writer.println("</div>");
		writer.println("</body>");
		writer.println("</html>");
		req.getRequestDispatcher("/read").include(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Invoked CollegeServlet doPost method");
		String name = req.getParameter("name");
		String location = req.getParameter("location");
		int noOfStudents = Integer.parseInt(req.getParameter("noOfStudents"));
		int noOfStaffs = Integer.parseInt(req.getParameter("noOfStaffs"));

		CollegeDto dto = new CollegeDto(name, location, noOfStudents, noOfStaffs);
		String saved = service.save(dto);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println(saved);
	}
}
