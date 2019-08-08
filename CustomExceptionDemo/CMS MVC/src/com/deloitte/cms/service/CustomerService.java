package com.deloitte.cms.service;

import java.util.List;

import com.deloitte.cms.model.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public List<Customer> getAllCustomersbyBillAmount(int minimum);
	public int insertCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public int deleteCustomer(int customerID);
	public Customer seachCustomerById(int customerId);
	public boolean customerExists(int customerId);
	public Integer customerCount();
}
