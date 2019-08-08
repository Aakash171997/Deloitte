package com.additionals;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerAddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return arg0.getCustomerAddress().compareTo(arg1.getCustomerAddress());
	}

}
