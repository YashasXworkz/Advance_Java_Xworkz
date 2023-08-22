package com.xworkz.stackoverflow.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xworkz.stackoverflow.service.StackServiceImpl;
import com.xworkz.stackoverflow.service.StackServiceInter;

@WebServlet(urlPatterns = "/delete")
public class StackDeleteServlet extends HttpServlet {
	public StackDeleteServlet() {
		System.out.println("Invoked StackDeleteServlet method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StackServiceInter service = new StackServiceImpl();
		HttpSession session = req.getSession();

		try {
			boolean deleted = service.validateAndDelete(id);
			if (deleted) {
				session.setAttribute("successMsg", "User Successfully Deleted");
				resp.sendRedirect("display.jsp");
			} else {
				session.setAttribute("errorMsg", "Something went wrong");
				resp.sendRedirect("display.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
