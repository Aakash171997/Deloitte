package com.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int op = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a choice:-\n"
				+ "1) Print all student info\n"
				+ "2) Insert a new student info\n");
		
		op = scanner.nextInt();
		if (op == 1) {
			printAllStudents();
		} else if(op == 2) {
			insertStudentInfo();
		}
		scanner.close();
	}

	public static void insertStudentInfo() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
		
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "system");
			System.out.println("Connected to DB");
			Statement statement = conn.createStatement();
			
			String sql = "insert into HR.stu values(";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Roll number: ");
			sql += scan.nextInt();
			
			System.out.println("Name: ");
			String name = scan.next();
			
			sql = sql+",\'"+name+"\'"+")";
			System.out.println(sql);
			
			int rows = statement.executeUpdate(sql);
			
			System.out.println(rows+" Rows created");
			
			scan.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void printAllStudents() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
		
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "system");
			System.out.println("Connected to DB");
			Statement statement = conn.createStatement();
			
			ResultSet set = statement.executeQuery("select * from HR.stu");
			
			while(set.next()) {
				System.out.println(set.getString(1)+" "+set.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
