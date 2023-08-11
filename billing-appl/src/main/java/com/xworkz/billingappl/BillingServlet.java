package com.xworkz.billingappl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class BillingServlet extends HttpServlet {
	public BillingServlet() {
		System.out.println("BillingServlet constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doPost method");
		String name = req.getParameter("name");
		String itemName = req.getParameter("itemName");
		String itemType = req.getParameter("itemType");
		String qty = req.getParameter("qty");

		double gst = 0.00;
		double sst = 0.00;
		double itemPrice = 0.00;

		if (itemType.equals("grocery")) {
			gst = 18.00 / 100;
			sst = 5.00 / 100;
			itemPrice = 299.00;
		} else if (itemType.equals("electric")) {
			gst = 25.00 / 100;
			sst = 18.00 / 100;
			itemPrice = 15999.00;
		} else if (itemType.equals("cloth")) {
			gst = 15.00 / 100;
			sst = 3.00 / 100;
			itemPrice = 599.00;
		}
		double totalBill = (itemPrice * Integer.parseInt(qty)) + (itemPrice * gst) + (itemPrice * sst);
		req.setAttribute("n", name);
		req.setAttribute("in", itemName);
		req.setAttribute("it", itemType);
		req.setAttribute("q", qty);
		req.setAttribute("tb", totalBill);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("display.jsp");
		requestDispatcher.forward(req, resp);
	}
}
