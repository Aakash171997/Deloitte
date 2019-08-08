package com.deloitte.client;

import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.entities.Customer;

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
					+ "Enter the option:");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int op = scan.nextInt();
			
			if(op==1) {
				List<Customer> allCusts = customerOps.getAllCustomers();
				for(Customer c: allCusts) {
					System.out.println(c);
				}
			} else if(op == 2) {
				System.out.print("Enter the customer ID: ");
				int custId = scan.nextInt();
				Customer c = customerOps.seachCustomerById(custId);
				if(c!=null) {
					System.out.println(c);
				} else {
					System.out.println("Customer Does not exist");
				}
			} else if(op==3) {
				System.out.println("Enter customer details");
				System.out.print("Customer ID: ");
				int custId = scan.nextInt();
				System.out.print("Customer Name: ");
				String name = scan.next();
				System.out.print("Customer Address: ");
				String addr = scan.next();
				System.out.print("Bill Amount: ");
				int bill= scan.nextInt();
				
				int rows = customerOps.insertCustomer(new Customer(custId, name, addr, bill));
				
				System.out.println(rows+" rows updated");
			} else if(op==4) {
				System.out.println("Enter ID to modify: ");
				int custId = scan.nextInt();
				
				System.out.println("Enter customer details");
				System.out.print("Customer Name: ");
				String name = scan.next();
				System.out.print("Customer Address: ");
				String addr = scan.next();
				System.out.print("Bill Amount: ");
				int bill= scan.nextInt();
				
				int rows = customerOps.updateCustomer(new Customer(custId, name, addr, bill));
				
				if(rows!=0) {
					System.out.println(rows+" rows updated");
				} else {
					System.out.println("Customer not found");
				}
			} else if(op==5) {
				System.out.print("Enter ID to delete: ");
				int custId = scan.nextInt();
				
				int rows = customerOps.deleteCustomer(custId);
				
				if(rows!=0) {
					System.out.println(rows+" rows deleted");
				} else {
					System.out.println("Customer not found");
				}
			} else {
				break;
			}
		}
	}

}
