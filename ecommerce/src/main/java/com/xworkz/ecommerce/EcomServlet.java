package com.xworkz.ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ecommerce.dto.EcomUserDTO;
import com.xworkz.ecommerce.service.EcomServiceImpl;
import com.xworkz.ecommerce.service.EcomServiceInter;

@WebServlet(urlPatterns = "/register")
public class EcomServlet extends HttpServlet {

	public EcomServlet() {
		System.out.println("EcomServlet Constructor");
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

		EcomUserDTO eDto = new EcomUserDTO();
		eDto.setUserName(name);
		eDto.setEmailId(email);
		eDto.setPhoneNumber(Long.parseLong(phoneNo));
		eDto.setAddress(address);

		EcomServiceInter eInter = new EcomServiceImpl();
		boolean valid = eInter.validateDTO(eDto);

		if (valid) {
			req.setAttribute("dto", eDto);
			req.setAttribute("gen", gender);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
