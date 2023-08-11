package com.xworkz.jobsearchapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jobsearchapp.dto.UserDTO;
import com.xworkz.jobsearchapp.service.JobSearchServiceImpl;
import com.xworkz.jobsearchapp.service.JobSearchServiceInter;

@WebServlet(urlPatterns = "/register")
public class JobSearchAppServlet extends HttpServlet {
	public JobSearchAppServlet() {
		System.out.println("JobSearchApp Constructor");
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

		UserDTO userDTO = new UserDTO();
		userDTO.setUserName(name);
		userDTO.setEmailId(email);
		userDTO.setPhoneNumber(Long.parseLong(phoneNo));
		userDTO.setAddress(address);

		JobSearchServiceInter serviceInter = new JobSearchServiceImpl();
		boolean verify = serviceInter.verifyDetails(userDTO);

		if (verify) {
			req.setAttribute("dto", userDTO);
			req.setAttribute("gen", gender);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("failure.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
