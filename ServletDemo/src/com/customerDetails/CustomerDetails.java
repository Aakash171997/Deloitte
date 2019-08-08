package com.customerDetails;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.entities.Customer;

public class CustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public CustomerDetails() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerAddress = request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		
//		response.getWriter().println("Customer ID: "+customerId+"<br />");
//		response.getWriter().println("Customer Name: "+customerName+"<br />");
//		response.getWriter().println("Customer Address: "+customerAddress+"<br />");
//		response.getWriter().println("Bill Amount: "+billAmount+"<br />");
		
		Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
		CustomerDAO customerOps = new CustomerDAOImpl();
		int rows = customerOps.insertCustomer(customer);
		
		if(rows!=0) {
			response.getWriter().println(rows+" customer detail inserted");
		} else {
			response.getWriter().println("Error in insert operation!");
		}
	}

}
