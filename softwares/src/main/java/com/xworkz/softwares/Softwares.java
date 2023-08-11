package com.xworkz.softwares;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/click")
public class Softwares extends HttpServlet {
	public Softwares() {
		System.out.println("Softwares Constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doPost method");
		String name = req.getParameter("userName");
		String email = req.getParameter("emailId");
		String phoneNo = req.getParameter("phoneNumber");
		String address = req.getParameter("address");
		String password = req.getParameter("psw");
		String gender = req.getParameter("gender");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>");
		writer.println("</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Registration Successfully Done.");
		writer.println("<h2>Client Details</h2>");
		writer.println("<h3>" + "Username: " + name + "</h3>");
		writer.println("<h3>" + "E-mail: " + email + "</h3>");
		writer.println("<h3>" + "Phone: " + phoneNo + "</h3>");
		writer.println("<h3>" + "Address: " + address + "</h3>");
		writer.println("<h3>" + "Password: " + password + "</h3>");
		writer.println("<h3>" + "Gender: " + gender + "</h3>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
