package com.ems.client;

import java.util.List;
import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.dao.impl.EmployeeDAOImpl;
import com.ems.entity.Employee;

public class ClientApp {

	public static void main(String[] args) {
		EmployeeDAO emsOps = new EmployeeDAOImpl();
		String empId;
		System.out.println("M E N U\n"
				+ "1) Get all\n"
				+ "2) Get Employee by ID\n"
				+ "3) Update employee record\n"
				+ "4) Delete Employee\n"
				+ "5) Insert Employee\n"
				+ "Enter your choice:- ");
		
		Scanner scan = new Scanner(System.in);
		
		int op = scan.nextInt();
		
		switch(op) {
		case 1:
			List<Employee> allEmps =  emsOps.getAllEmployees();
			for(Employee e: allEmps) {
				System.out.println(e);
			}
			
			break;
		case 2:
			System.out.println("Please enter employee ID: ");
			 empId = scan.next();
			if(emsOps.employeeExists(empId)) {
				Employee employee = emsOps.getEmployeeById(empId);
				System.out.println(employee);
			} else {
				System.out.println("Employee does not exist!");
			}
			break;
		case 3:
			System.out.println("Please Enter employee ID: ");
			empId = scan.next();
			if(emsOps.employeeExists(empId)) {
				Employee employee = new Employee(empId);
				System.out.print("First Name: ");
				employee.setfName(scan.next());
				System.out.print("Last Name: ");
				employee.setLastName(scan.next());
				System.out.print("DOB (mm/dd/yyyy): ");
				employee.setDob(scan.next());
				System.out.print("Address: ");
				employee.setAddress(scan.next());
				
				int rows = emsOps.updateEmployee(employee);
				System.out.println(rows+" employee updated");
			} else {
				System.out.println("Employee does not exist");
			}
			break;
		case 4:
			System.out.println("Please Enter employee ID: ");
			empId = scan.next();
			if(emsOps.employeeExists(empId)) {
				int rows = emsOps.deleteEmployee(empId);
				System.out.println(rows + " employee deleted");
			} else {
				System.out.println("Employee Does not exist");
			}
		case 5:
			Employee employee = new Employee();
			System.out.print("First Name: ");
			employee.setfName(scan.next());
			System.out.print("Last Name: ");
			employee.setLastName(scan.next());
			System.out.print("Employee ID: ");
			employee.setEmpId(scan.next());
			System.out.print("DOB (mm/dd/yyyy): ");
			employee.setDob(scan.next());
			System.out.print("Address: ");
			employee.setAddress(scan.next());
			
			int rows = emsOps.insertEmployee(employee);
			System.out.println(rows + " employee added");
		}
		
		scan.close();

	}

}
