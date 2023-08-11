package com.xworkz.travelapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/distance")
public class TravelServlet extends HttpServlet {
	public TravelServlet() {
		System.out.println("TravelServlet constructor");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked doPost method");
		String start = req.getParameter("start");
		String end = req.getParameter("end");

		double distanceInKM = 0.0;
		if ((start.equals("bangalore") && end.equals("goa")) || (start.equals("goa") && end.equals("bangalore"))) {
			distanceInKM = 557.7;
		} else if ((start.equals("mysore") && end.equals("bangalore"))
				|| (start.equals("bangalore") && end.equals("mysore"))) {
			distanceInKM = 144.6;
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("notfound.jsp");
			dispatcher.forward(req, resp);
		}

		req.setAttribute("st", start.toUpperCase());
		req.setAttribute("en", end.toUpperCase());
		req.setAttribute("di", distanceInKM);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
