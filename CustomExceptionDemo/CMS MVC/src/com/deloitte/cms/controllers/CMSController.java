package com.deloitte.cms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;


@Controller
public class CMSController {

	@Autowired
	CustomerService service;
	
	@RequestMapping("/add")
	public ModelAndView addCustomer(Customer customer) {
		service.insertCustomer(customer);
		ModelAndView view = new ModelAndView("success");
		view.addObject("cid", customer.getCustomerId());
		view.addObject("name", customer.getCustomerName());
		view.addObject("address", customer.getCustomerAddress());
		view.addObject("bill", customer.getBillAmount());
		return view;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateCustomer(Customer customer) {
		int rows = service.updateCustomer(customer);
		if(rows>0) {
			ModelAndView view = new ModelAndView("success");
			view.addObject("cid", customer.getCustomerId());
			view.addObject("name", customer.getCustomerName());
			view.addObject("address", customer.getCustomerAddress());
			view.addObject("bill", customer.getBillAmount());
			return view;
		} else if(rows==-1) {
			ModelAndView view = new ModelAndView("failure");
			view.addObject("cause", "Negative Customer ID");
			return view;
		} else {
			ModelAndView view = new ModelAndView("failure");
			view.addObject("cause", "Customer Not Found");
			return view;
		}
	}
	
	@RequestMapping("/delete")
	public String deleteCustomer() {
		return "deleteCustomer";
	}
	
	@RequestMapping("/find")
	public ModelAndView findCustomer(Customer customer) {
		customer = service.seachCustomerById(customer.getCustomerId());
		ModelAndView view = new ModelAndView("SearchCustomerById", "command", customer);
		return view;
	}
	
	@RequestMapping("/listAll")
	public String listAllCustomers() {
		return "listCustomer";
	}
	
	@RequestMapping("/searchCustomerByIdForm")
	public ModelAndView searchCustomerByIdForm() {
		return new ModelAndView("SearchCustomerById", "command", new Customer());
	}
}
