package com.xworkz.stackoverflow.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xworkz.stackoverflow.dto.StackDTO;
import com.xworkz.stackoverflow.service.StackServiceImpl;
import com.xworkz.stackoverflow.service.StackServiceInter;

@WebServlet(urlPatterns = "/save")
public class StackSaveServlet extends HttpServlet {
	StackServiceInter service;
	StackDTO dto;

	public StackSaveServlet() {
		System.out.println("StackServlet constructor");
	}

	@Override
	public void init() throws ServletException {
		service = new StackServiceImpl();
		dto = new StackDTO();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String phone = req.getParameter("uphno");
		String address = req.getParameter("uaddress");
		String followers = req.getParameter("ufollowers");
		String noOfQuesAns = req.getParameter("uqans");
		String noOfQuesAsk = req.getParameter("uqask");
		String badges = req.getParameter("ubadges");
		String skill = req.getParameter("uskill");
		String memberSince = req.getParameter("umembersince");

		dto.setName(name);
		dto.setEmail(email);
		dto.setPhoneNo(Long.parseLong(phone));
		dto.setAddress(address);
		dto.setFollowers(Integer.parseInt(followers));
		dto.setNoOfQuesAnswered(Integer.parseInt(noOfQuesAns));
		dto.setNoOfQuesAsked(Integer.parseInt(noOfQuesAsk));
		dto.setBadges(badges);
		dto.setSkills(skill);
		dto.setMemberSince(memberSince);
		System.out.println(dto.toString());

		HttpSession session = req.getSession();
		try {
			boolean valid = service.validateAndSave(dto);
			if (valid) {
				session.setAttribute("successMsg", "Registration Success!");
				resp.sendRedirect("register.jsp");
			} else {
				session.setAttribute("errorMsg", "Something went wrong");
				resp.sendRedirect("register.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
