package com.xworkz.courseapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.courseapp.dto.UserDTO;
import com.xworkz.courseapp.service.CourseServiceImpl;
import com.xworkz.courseapp.service.CourseServiceInter;

@WebServlet(urlPatterns = "/register")
public class CourseAppServlet extends HttpServlet {

	public CourseAppServlet() {
		System.out.println("CourseApp Constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
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

		CourseServiceInter serviceInter = new CourseServiceImpl();
		boolean verified = serviceInter.verifyDetails(userDTO);
		if (verified) {
			System.out.println(userDTO);
		}

		req.setAttribute("dto", userDTO);
		req.setAttribute("gen", gender);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, resp);
	}
}
