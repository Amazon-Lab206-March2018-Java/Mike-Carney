package com.micarney.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session == null) {
			session = request.getSession();
			Random random = new Random();
			Integer numb = random.nextInt(99)+1;
			session.setAttribute("numb",numb);
			session.setAttribute("results", null);
		}
		System.out.println(session.getAttribute("numb"));
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Boolean reroll = Boolean.valueOf(request.getParameter("reroll"));
		if (reroll) {
			session.invalidate();
			doGet(request, response);
		}
		else {
			if (request.getParameter("roll") == "") {
				session.setAttribute("roll", 0);
			}
			else {
				System.out.println(request.getParameter("roll"));
				Integer x = Integer.valueOf(request.getParameter("roll"));
				session.setAttribute("roll", x);
			}
			System.out.println(request.getParameter("roll"));
			if (session.getAttribute("numb") == session.getAttribute("roll")){
					session.setAttribute("results", true);
		}
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
			view.forward(request, response);
		}
	}

}
