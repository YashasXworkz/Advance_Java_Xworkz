package com.xworkz.ott;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ott.dto.ClientDTO;
import com.xworkz.ott.service.OttServiceImpl;
import com.xworkz.ott.service.OttServiceInter;

@WebServlet(urlPatterns = "/register")
public class OTTServlet extends HttpServlet {
	public OTTServlet() {
		System.out.println("OTTServlet Constructor");
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

		ClientDTO clientDTO = new ClientDTO();
		clientDTO.setUserName(name);
		clientDTO.setEmailId(email);
		clientDTO.setPhoneNumber(Long.parseLong(phoneNo));
		clientDTO.setAddress(address);

		OttServiceInter serviceInter = new OttServiceImpl();
		boolean valid = serviceInter.validateData(clientDTO);

		if (valid) {
			System.out.println("Successfully Verified");
			System.out.println(clientDTO);
		} else {
			System.out.println("Not Verified");
		}

		req.setAttribute("dto", clientDTO);
		req.setAttribute("gen", gender);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, resp);
	}
}
