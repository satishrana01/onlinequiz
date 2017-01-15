package com.quiz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	
	private static final long serialVersionUID = -2880279416279792672L;
    public static final List<String> STATELIST = new ArrayList<>();
	
	static{
		STATELIST.add("Alabama:Montgomery");
		STATELIST.add("Alaska:Juneau");
		STATELIST.add("Arizona:Phoenix");
		STATELIST.add("Arkansas:Little Rock");
		STATELIST.add("California:Sacramento");
		STATELIST.add("Colorado:Denver");
		STATELIST.add("Connecticut:Hartford");
		STATELIST.add("Delaware:Dover");
		STATELIST.add("Florida:Tallahassee");
		STATELIST.add("Georgia:Atlanta");
		STATELIST.add("Hawaii:Honolulu");
		STATELIST.add("Idaho:Boise");
		STATELIST.add("Illinois:Springfield");
		STATELIST.add("Indiana:Indianapolis");
		STATELIST.add("Iowa:Des Moines");
		STATELIST.add("Kansas:Topeka");
		STATELIST.add("Kentucky:Frankfort");
		STATELIST.add("Louisiana:Baton Rouge");
		STATELIST.add("Maine:Augusta");
		STATELIST.add("Maryland:Annapolis");
		STATELIST.add("Massachusetts:Boston");
		STATELIST.add("Michigan:Lansing");
		STATELIST.add("Minnesota:Saint Paul");
		STATELIST.add("Mississippi:Jackson");
		STATELIST.add("Missouri:Jefferson City");
		STATELIST.add("Montana:Helena");
		STATELIST.add("Nebraska:Lincoln");
		STATELIST.add("Nevada:Carson City");
		STATELIST.add("New Hampshire:Concord");
		STATELIST.add("New Jersey:Trenton");
		STATELIST.add("New Mexico:Santa Fe");
		STATELIST.add("New York:Albany");
		STATELIST.add("North Carolina:Raleigh");
		STATELIST.add("North Dakota:Bismarck");
		STATELIST.add("Ohio:Columbus");
		STATELIST.add("Oklahoma:Oklahoma City");
		STATELIST.add("Oregon:Salem");
		STATELIST.add("Pennsylvania:Harrisburg");
		STATELIST.add("Rhode Island:Providence");
		STATELIST.add("South Carolina:Columbia");
		STATELIST.add("South Dakota:Pierre");
		STATELIST.add("Tennessee:Nashville");
		STATELIST.add("Texas:Austin");
		STATELIST.add("Utah:Salt Lake City");
		STATELIST.add("Vermont:Montpelier");
		STATELIST.add("Virginia:Richmond");
		STATELIST.add("Washington:Olympia");
		STATELIST.add("West Virginia:Charleston");
		STATELIST.add("Wisconsin:Madison");
		STATELIST.add("Wyoming:Cheyenne");
	}
	public HomeController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Collections.shuffle(STATELIST);
		request.setAttribute("STATE", STATELIST.get(0).split(":")[0]);
		request.getRequestDispatcher("/home.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}
}