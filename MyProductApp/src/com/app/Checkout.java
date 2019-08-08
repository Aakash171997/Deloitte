package com.app;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checkout
 */
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] products = request.getParameterValues("products");
		
		ServletConfig config = getServletConfig();
		String cn = config.getInitParameter("companyName");
		
		response.getWriter().println("<h1>"+cn+"</h1>");
		
		if(products != null) {
			response.getWriter().println("You have selected:- <br/>");
			int sum = 0;
			for(String product: products) {
				sum += 10;
				response.getWriter().println(product+" Rs. 10<br/>");
			}
			
			response.getWriter().println("<br/>Total Amount = "+sum);
			response.getWriter().println("<br/>Please procede to payment:-"
					+"<br/><form action=\"Shipping\">"
					+"<input type=\"submit\" value=\"Pay\"></form>");
		} else {
			response.getWriter().println("You have not selected any products! <a href=Products.html>Select your products here</a>");
		}
	}

}
