package com.deloitte.client;

import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

public class ClientApp {

	public static void main(String[] args) {
		CustomerDAO customerOps = new CustomerDAOImpl();
		
		while(true) {
			System.out.println("M E N U\n"
					+ "1) Display all customers\n"
					+ "2) Display one customer\n"
					+ "3) Insert new customer\n"
					+ "4) Modify customer info\n"
					+ "5) Delete customer\n"
					+ "6) Get customer Count\n"
					+ "7) Display customers by minimum bill amount\n"
					+ "Enter the option:");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int op = scan.nextInt();
			
			if(op==1) { //All Customers
				List<Customer> allCusts = customerOps.getAllCustomers();
				for(Customer c: allCusts) {
					System.out.println(c);
				}
			} else if(op == 2) { //One Customer
				System.out.print("Enter the customer ID: ");
				int customerId = scan.nextInt();
				if(customerOps.customerExists(customerId)) {
					Customer c = customerOps.seachCustomerById(customerId);
					System.out.println(c);
				} else {
					System.out.println("Customer Does not exist");
				}
			} else if(op==3) { //New Customer
				System.out.println("Enter customer details");
				System.out.print("Customer ID: ");
				int customerId = scan.nextInt();
				if(!customerOps.customerExists(customerId)) {
					System.out.print("Customer Name: ");
					String name = scan.next();
					System.out.print("Customer Address: ");
					String addr = scan.next();
					System.out.print("Bill Amount: ");
					int bill= scan.nextInt();

					int rows = customerOps.insertCustomer(new Customer(customerId, name, addr, bill));

					System.out.println(rows+" rows updated");
				} else {
					System.out.println("Customer ID already assigned, please try something else,\n"
							+"or modify the customer details!");
				}
			} else if(op==4) { //Modify customer
				System.out.println("Enter ID to modify: ");
				int customerId = scan.nextInt();
				
				if(customerOps.customerExists(customerId)) {
					System.out.println("Enter customer details");
					System.out.print("Customer Name: ");
					String name = scan.next();
					System.out.print("Customer Address: ");
					String addr = scan.next();
					System.out.print("Bill Amount: ");
					int bill= scan.nextInt();

					int rows = customerOps.updateCustomer(new Customer(customerId, name, addr, bill));

					System.out.println(rows+" rows updated");
				} else {
					System.out.println("Customer not found");
				}
				
			} else if(op==5) { //Delete
				System.out.print("Enter ID to delete: ");
				int customerId = scan.nextInt();
				
				if(customerOps.customerExists(customerId)) {
					int rows = customerOps.deleteCustomer(customerId);
					System.out.println(rows+" rows deleted");
				} else {
					System.out.println("Customer not found");
				}
			} else if(op==6) {
				System.out.println("Number of customers registered: "+customerOps.customerCount());
			} else if(op==7){
				System.out.println("Enter the minimum bill amount: ");
				int minimum = scan.nextInt();
				List<Customer> allCusts = customerOps.getAllCustomersbyBillAmount(minimum);
				for(Customer c: allCusts) {
					System.out.println(c);
				}
			} else {
				break;
			}
		}
	}

}
