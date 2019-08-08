package com.additionals;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerIdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return arg0.getCustomerId() < arg1.getCustomerId() ? -1 : 
			(arg0.getCustomerId() > arg1.getCustomerId())? 1 :
				0;
	}

}
