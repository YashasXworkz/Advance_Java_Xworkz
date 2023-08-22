package com.xworkz.stackoverflow.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xworkz.stackoverflow.dto.StackDTO;
import com.xworkz.stackoverflow.service.StackServiceImpl;
import com.xworkz.stackoverflow.service.StackServiceInter;

@WebServlet(urlPatterns = "/search")
public class StackSearchServlet extends HttpServlet {
	public StackSearchServlet() {
		System.out.println("StackSearchServlet constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("search");

		StackServiceInter service = new StackServiceImpl();
		HttpSession session = req.getSession();
		try {
			List<StackDTO> d = service.search(s);
			if (!d.isEmpty()) {
				req.setAttribute("sr", d);
				int size = d.size();
				session.setAttribute("successMsg", +size + " Users found");
				RequestDispatcher dispatcher = req.getRequestDispatcher("sresult.jsp");
				dispatcher.forward(req, resp);
			} else {
				session.setAttribute("errorMsg", "User not found");
				RequestDispatcher dispatcher = req.getRequestDispatcher("sresult.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
