package com.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Action
 */
@WebServlet("/Action")
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Action() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		// TODO Auto-generated method stub
				String vaildname = "computer";
				String validpassword="computer123";
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				if(username.equals(vaildname) || password.equals(validpassword) )
				{
					RequestDispatcher req = request.getRequestDispatcher("welcome.jsp");
					req.include(request, response);
				}
				else
				{
					RequestDispatcher req = request.getRequestDispatcher("error.jsp");
					req.forward(request, response);
				}
		
	}

}
