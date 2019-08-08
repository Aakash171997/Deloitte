package com.deloitte.cms.dao;

import java.util.List;

import com.deloitte.entities.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomers();
	public int insertCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public int deleteCustomer(int customerID);
	public Customer seachCustomerById(int customerId);
	public boolean customerExists(int customerId);
}
