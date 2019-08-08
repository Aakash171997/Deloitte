package com.additionals;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerBillComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return arg0.getBillAmount() < arg1.getBillAmount()? -1 : 
			(arg0.getBillAmount() > arg1.getBillAmount())? 1 :
				0;
	}

}
