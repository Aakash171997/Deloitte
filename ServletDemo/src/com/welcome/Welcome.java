package com.welcome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	
	int counter = 0;
	private static final long serialVersionUID = 1L;
       
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		counter++;
		String gn = request.getParameter("guestName");
		String[] colors = request.getParameterValues("colorSelect");
		
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello, Welcome "+gn+"</h1>");
		response.getWriter().println("<h2>You are visitor number: "+counter+"</h2>");
		
		if(colors != null) {
			for(String color:colors) {
				response.getWriter().println("<font color=\""+color+"\">Hello "+gn+"</font></br>");
			}
		} else {
			response.getWriter().println("No colour selected!");
		}
	}

}
