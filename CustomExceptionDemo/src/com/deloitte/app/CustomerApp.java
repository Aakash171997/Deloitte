package com.deloitte.app;

import com.deloitte.exceptions.InvalidAddressException;
import com.deloitte.exceptions.InvalidCustIdException;
import com.deloitte.exceptions.InvalidNameException;
import com.deloitte.exceptions.NegativeAmountException;
import com.deloitte.model.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		Customer customer;
		try {
			customer = new Customer(1, "John", "Dallas", -1000);
			System.out.println(customer.toString());
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCustIdException e) {
			System.out.println(e.getMessage());
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidAddressException e) {
			System.out.println(e.getMessage());
		}

	}

}
