package com.xworkz.passport.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImpl;

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
	PassportService service;
	PassportEntity entity;

	public UpdateServlet() {
		System.out.println("Invoked UpdateServlet method");
	}

	@Override
	public void init() throws ServletException {
		service = new PassportServiceImpl();
		entity = new PassportEntity();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doPost method");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("uname");
		Date dob = java.sql.Date.valueOf(req.getParameter("udob"));
		String email = req.getParameter("uemail");
		long phoneNo = Long.parseLong(req.getParameter("uphone"));
		String password = req.getParameter("upass1");
		String cPassword = req.getParameter("upass2");
		long aadhaar = Long.parseLong(req.getParameter("uaadh"));
		String pOffice = req.getParameter("passOffice");

		entity = service.validateAndGetById(id);

		if (entity != null) {
			entity.setName(name);
			entity.setDob(dob);
			entity.setEmail(email);
			entity.setPhoneNo(phoneNo);
			entity.setPassword(password);
			entity.setConfirmPassword(cPassword);
			entity.setAadhaarNo(aadhaar);
			entity.setPassportOffice(pOffice);
			boolean updated = service.validateAndUpdate(entity);
			req.setAttribute("succmsg", "Updated!");
			RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req, resp);
		} else {
			req.setAttribute("errmsg", "Something went wrong");
			RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
