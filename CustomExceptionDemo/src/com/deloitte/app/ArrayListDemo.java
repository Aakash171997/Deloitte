package com.deloitte.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.deloitte.exceptions.InvalidAddressException;
import com.deloitte.exceptions.InvalidCustIdException;
import com.deloitte.exceptions.InvalidNameException;
import com.deloitte.exceptions.NegativeAmountException;
import com.deloitte.model.Customer;
import com.additionals.CustomerAddressComparator;
import com.additionals.CustomerBillComparator;
import com.additionals.CustomerIdComparator;

public class ArrayListDemo {

	public static void main(String[] args) throws NegativeAmountException, InvalidCustIdException, InvalidNameException, InvalidAddressException {
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1, "Anwesh", "Bengaluru", 9000);
		customerList.add(customer1);
		customerList.add(new Customer(2, "Anjan", "Mysore", 8000));
		customerList.add(new Customer(3, "John", "Dallas", 3000));
		customerList.add(new Customer(4, "Job", "Coimbatore", 2000));
		customerList.add(new Customer(5, "Mathew", "Miami", 1500));
		customerList.add(new Customer(6, "Karl", "San Jose", 5100));
		customerList.add(new Customer(7, "Cob", "California", 5000));
		
//		System.out.println(customerList);
		
		Iterator<Customer> iterator = customerList.iterator();
		
		while(iterator.hasNext()) {
			Customer cust = iterator.next();
			if(cust.getBillAmount() > 4000) {
				System.out.print(cust);
			}
		}
		
		System.out.println("\nCustomers from Mysore");
		
		for(Customer cust: customerList) {
			if(cust.getCustomerAddress().equalsIgnoreCase("Mysore")) {
				System.out.println(cust);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sort the list by \n"
				+ "1) Name\n"
				+ "2) Bill Amount\n"
				+ "3) ID\n"
				+ "4) Address");
		
		int op = scan.nextInt();
		
		switch (op) {
		case 1:
			Collections.sort(customerList);
			break;
		case 2:
			Collections.sort(customerList, new CustomerBillComparator());
			break;
		case 3:
			Collections.sort(customerList, new CustomerIdComparator());
			break;
		case 4:
			Collections.sort(customerList, new CustomerAddressComparator());
			break;

		default:
			Collections.sort(customerList);
			break;
		}
		
		System.out.println(customerList);
		
		scan.close();

	}

}
