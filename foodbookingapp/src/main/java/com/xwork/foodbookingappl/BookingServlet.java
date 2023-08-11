package com.xwork.foodbookingappl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/click")
public class BookingServlet extends HttpServlet {
	public BookingServlet() {
		System.out.println("BookingServlet constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doPost method");
		String name = req.getParameter("custName");
		String fname = req.getParameter("foodName");
		String ftype = req.getParameter("foodType");
		int qty = Integer.parseInt(req.getParameter("qty"));
		String location = req.getParameter("address");

		double price = 0.00;
		if (ftype.equals("spicy")) {
			price = 55.00;
		} else if (ftype.equals("sweet")) {
			price = 75.00;
		} else if (ftype.equals("medium")) {
			price = 105.00;
		} else {
			req.setAttribute("fn", fname);
			RequestDispatcher dispatcher = req.getRequestDispatcher("typenotfound.jsp");
			dispatcher.forward(req, resp);
		}

		double deliveryCharges = deliveryChargesByLocation(location);
		double totalBill = (price * qty) + deliveryCharges;

		req.setAttribute("cn", name);
		req.setAttribute("fn", fname);
		req.setAttribute("ft", ftype);
		req.setAttribute("qt", qty);
		req.setAttribute("tb", totalBill);
		RequestDispatcher dispatcher = req.getRequestDispatcher("bill.jsp");
		dispatcher.forward(req, resp);
	}

	public double deliveryChargesByLocation(String location) {
		double deliveryCharges = 0.00;
		if (location.equals("bangalore")) {
			deliveryCharges += 100;
		} else {
			deliveryCharges += 200;
		}
		return deliveryCharges;
	}
}
