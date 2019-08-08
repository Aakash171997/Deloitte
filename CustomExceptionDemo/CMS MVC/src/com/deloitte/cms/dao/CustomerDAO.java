package com.deloitte.cms.dao;

import java.util.List;

import com.deloitte.cms.model.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomers();
	public List<Customer> getAllCustomersbyBillAmount(int minimum);
	public int insertCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public int deleteCustomer(int customerID);
	public Customer seachCustomerById(int customerId);
	public boolean customerExists(int customerId);
	public Integer customerCount();
}
