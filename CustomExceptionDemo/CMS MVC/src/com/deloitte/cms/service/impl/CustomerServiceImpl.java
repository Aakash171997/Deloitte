package com.deloitte.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO cmsOps;
	
	@Override
	public List<Customer> getAllCustomers() {
		return cmsOps.getAllCustomers();
	}

	@Override
	public List<Customer> getAllCustomersbyBillAmount(int minimum) {
		// TODO Auto-generated method stub
		return cmsOps.getAllCustomersbyBillAmount(minimum);
	}

	@Override
	public int insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cmsOps.insertCustomer(customer);
	}

	@Override
	public int updateCustomer(Customer customer) {
		int id = customer.getCustomerId();
		if(id>0) {
			if(cmsOps.customerExists(id)) {
				return cmsOps.updateCustomer(customer);
			} else {
				return 0;
			}
		} else {
			return -1;
		}
	}

	@Override
	public int deleteCustomer(int customerID) {
		// TODO Auto-generated method stub
		return cmsOps.deleteCustomer(customerID);
	}

	@Override
	public Customer seachCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return cmsOps.seachCustomerById(customerId);
	}

	@Override
	public boolean customerExists(int customerId) {
		// TODO Auto-generated method stub
		return cmsOps.customerExists(customerId);
	}

	@Override
	public Integer customerCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
