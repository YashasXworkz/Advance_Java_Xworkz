package com.xworkz.passport.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImpl;

@WebServlet(urlPatterns = "/save")
public class SaveServlet extends HttpServlet {
	PassportService service;
	PassportDTO dto;
	PassportEntity entity;

	public SaveServlet() {
		System.out.println("Invoked SaveServlet Constructor");
	}

	@Override
	public void init() throws ServletException {
		service = new PassportServiceImpl();
		dto = new PassportDTO();
		entity = new PassportEntity();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doPost method");
		dto.setName(req.getParameter("uname"));
		dto.setDob(Date.valueOf(req.getParameter("udob")));
		dto.setEmail(req.getParameter("uemail"));
		dto.setPhoneNumber(Long.parseLong(req.getParameter("uphone")));
		dto.setPassword(req.getParameter("upass1"));
		dto.setConfirmPassword(req.getParameter("upass2"));
		dto.setAadhaarNo(Long.parseLong(req.getParameter("uaadh")));
		dto.setPassportOffice(req.getParameter("passOffice"));

		if (dto.getPassword().equals(dto.getConfirmPassword())) {
			boolean saved = service.validateAndSave(dto);
			if (saved) {
				req.setAttribute("succmsg", dto.getName().toUpperCase() + "!, You have Registered Successfully");
				RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("errmsg", "Something went wrong!");
				RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
				dispatcher.forward(req, resp);
			}
		} else {
			req.setAttribute("passerr", "Passwords don't match. Please try again.");
			RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
