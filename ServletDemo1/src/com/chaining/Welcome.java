package com.chaining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		RequestDispatcher dispatcher;
		
		if(userName.startsWith("A") || userName.startsWith("a")) {
			 dispatcher = request.getRequestDispatcher("Apple");
		} else {
			dispatcher = request.getRequestDispatcher("Others");
		}
		
		dispatcher.forward(request, response);
	}

}
