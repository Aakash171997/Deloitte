package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.customer.db.CustomerDBUtility;

public class CustomerJDBCOperations {
	public static void printAllCustomers() {
		try {
			Connection conn = CustomerDBUtility.dbConnect();
			
			Statement statement = conn.createStatement();
			
			ResultSet set = statement.executeQuery("select * from HR.customer");
			System.out.println("----------------\n");
			int count = 0;
			while(set.next()) {
				System.out.println(set.getString(1)+" "
						+set.getString(2)+" "
						+set.getString(3)+" "
						+set.getString(4));
				count++;
			}
			
			System.out.println("\n"+count+" No of rows displayed");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertNewCustomer() {
		try {
			Connection conn = CustomerDBUtility.dbConnect();
			
			PreparedStatement statement = conn.prepareStatement("insert into hr.customer values(?,?,?,?)");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Customer ID: ");
			int customerId= scan.nextInt();
			
			System.out.println("Name: ");
			String customerName = scan.next();
						
			System.out.println("Address: ");
			String customerAddress = scan.next();
			
			System.out.println("Bill amount: ");
			int billAmount = scan.nextInt();
			statement.setInt(1, customerId);
			statement.setString(2, customerName);
			statement.setString(3, customerAddress);
			statement.setInt(4, billAmount);	
			
			int rows = statement.executeUpdate();
			
			System.out.println(rows+" Rows created");
			
			scan.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		printAllCustomers();
	}
	
	public static void printCustomerInfo() {
		try {
		
			Connection conn = CustomerDBUtility.dbConnect1();
			
			Statement statement = conn.createStatement();
			
			Scanner scanner = new Scanner(System.in);
			
			String sql = "select * from HR.customer where customerid=";
			System.out.println("Enter customer ID:");
			sql+= scanner.nextInt();
			
			ResultSet set = statement.executeQuery(sql);
			scanner.close();
			
			System.out.println("----------------\n");
			while(set.next()) {
				System.out.println("Customer ID: "+set.getString(1)+"\n"
						+"Name: "+set.getString(2)+"\n"
						+"Address: "+set.getString(3)+"\n"
						+"Bill Amount: "+set.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void deleteCustomerInfo() {
		try {
			Connection conn = CustomerDBUtility.dbConnect();
			PreparedStatement statement = conn.prepareStatement("delete from HR.customer where customerid=?");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Customerlist");
			printAllCustomers();
			System.out.println("pls provide customer Id tat must be deleted");
			System.out.println("Enter customer ID");
			int custId=scanner.nextInt();
			statement.setInt(1, custId);
			int rows = statement.executeUpdate();
			scanner.close();
			System.out.println(rows+"row(s) deleted");
			System.out.println("New Customer List");
			printAllCustomers();
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
