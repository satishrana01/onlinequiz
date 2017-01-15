package com.quiz.controller;

import static com.quiz.controller.HomeController.STATELIST; 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidatorController extends HttpServlet {

	private static final long serialVersionUID = 5638595861972636346L;

	public ValidatorController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String responseStatus = "No";
		String userAnswer = request.getParameter("answer").trim();
		String actulQuestion = STATELIST.get(0).split(":")[0];
		String actulAnswer = STATELIST.get(0).split(":")[1];
		String responseString = ", The capital of "+actulQuestion+" is "+actulAnswer+".";
		if(userAnswer.equalsIgnoreCase(actulAnswer)){
			
			responseStatus = "Yes";
		}
		request.setAttribute("result", responseStatus+responseString);
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
