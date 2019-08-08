package com.customer.app;

import java.util.Scanner;

import com.customer.db.CustomerJDBCOperations;

public class Client {

	public static void main(String[] args) {
		System.out.println("M E N U\n"
				+ "1) Print all Customers info\n"
				+ "2) Insert a new Customer info\n"
				+ "3) Print a specific customer info\n"
				+ "4) Delete a specific customer\n"
				+ "Enter a choice:");
		
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();
		
		switch (op) {
		case 1:
			CustomerJDBCOperations.printAllCustomers();
			break;
		case 2:
			CustomerJDBCOperations.insertNewCustomer();
			break;
		case 3:
			CustomerJDBCOperations.printCustomerInfo();
			break;
		case 4:
			CustomerJDBCOperations.deleteCustomerInfo();
			break;

		default:
			System.out.println("Invalid option");
			break;
		}
		scanner.close();

	}

}
