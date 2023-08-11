package com.xworkz.gmailtype;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/click")
public class GamilServlet extends HttpServlet {
	public GamilServlet() {
		System.out.println("GmailServlet constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost method");
		String name = req.getParameter("username");
		String mailType = req.getParameter("mailtype");

		if (mailType.equals("@gmail.com")) {
		} else if (mailType.equals("@yahoo.in")) {
		} else if (mailType.equals("@yandex.com")) {
		} else {
			req.setAttribute("errmsg", "Not found");
			RequestDispatcher dispatcher = req.getRequestDispatcher("notfound.jsp");
			dispatcher.forward(req, resp);
		}
		req.setAttribute("mt", name + mailType);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
