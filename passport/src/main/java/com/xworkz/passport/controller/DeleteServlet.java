package com.xworkz.passport.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImpl;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
	PassportService service;

	public DeleteServlet() {
		System.out.println("Invoked DeleteServlet method");
	}

	@Override
	public void init() throws ServletException {
		service = new PassportServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doGet method");
		int id = Integer.parseInt(req.getParameter("id"));

		if (id != 0) {
			boolean deleted = service.validateAndDelete(id);
			if (deleted) {
				req.setAttribute("succmsg", "Deleted!");
				RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("errmsg", "Something went wrong!");
				RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
				dispatcher.forward(req, resp);
			}
		} else {
			System.out.println("Entity is null");
		}
	}
}
