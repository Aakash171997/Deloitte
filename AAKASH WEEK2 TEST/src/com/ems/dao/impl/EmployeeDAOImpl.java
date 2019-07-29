package com.ems.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.entity.Employee;
import com.ems.utils.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	//Queries
	private final String SELECT_ALL = "SELECT * FROM HR.employee";
	private final String INSERT_EMP = "INSERT INTO HR.employee VALUES(?,?,?,?,?)";
	private final String UPDATE_EMP = "UPDATE HR.employee"
			+"SET fName=? lastName=? empId=? dob=? address=?"
			+"WHERE empId=?";
	private final String DELETE_EMP = "delete from hr.employee where empid=?";
	private final String GET_EMP = "SELECT * FROM HR.employee WHERE empId=?";

	@Override
	public List<Employee> getAllEmployees() {
		Connection connection = DBUtility.dbConnect();
		PreparedStatement statement;
		List<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			statement = connection.prepareStatement(SELECT_ALL);
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				employeeList.add(new Employee(set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return employeeList;
	}

	@Override
	public int insertEmployee(Employee employee) {
		Connection connection = DBUtility.dbConnect();
		PreparedStatement statement;
		int rows=0;
		
		try {
			statement = connection.prepareStatement(INSERT_EMP);
			statement.setString(1, employee.getfName());
			statement.setString(1, employee.getLastName());
			statement.setString(1, employee.getEmpId());
			statement.setString(1, employee.getDob());
			statement.setString(1, employee.getAddress());
			
			rows = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public int updateEmployee(Employee employee) {
		Connection connection = DBUtility.dbConnect();
		PreparedStatement statement;
		int rows=0;
		
		try {
			statement = connection.prepareStatement(UPDATE_EMP);
			statement.setString(1, employee.getfName());
			statement.setString(1, employee.getLastName());
			statement.setString(1, employee.getEmpId());
			statement.setString(1, employee.getDob());
			statement.setString(1, employee.getAddress());
			statement.setString(1, employee.getEmpId());
			
			rows = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public int deleteEmployee(String empId) {
		Connection connection = DBUtility.dbConnect();
		PreparedStatement statement;
		int rows=0;
		
		try {
			statement = connection.prepareStatement(DELETE_EMP);
			
			rows = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public Employee getEmployeeById(String empId) {
		Connection connection = DBUtility.dbConnect();
		PreparedStatement statement;
		Employee employee = new Employee();
		
		try {
			statement = connection.prepareStatement(GET_EMP);
			statement.setString(1, empId);
			
			ResultSet set = statement.executeQuery();
			
			set.next();
			
			employee.setfName(set.getString(1));
			employee.setLastName(set.getString(2));
			employee.setEmpId(set.getString(3));
			employee.setDob(set.getString(4));
			employee.setAddress(set.getString(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public boolean employeeExists(String empId) {
		Connection connection = DBUtility.dbConnect();
		PreparedStatement statement;
		boolean employeeExists = false;
		
		try {
			statement = connection.prepareStatement(GET_EMP);
			statement.setString(1, empId);
			
			ResultSet set = statement.executeQuery();
			
			if(set.next()) {
				employeeExists = true;
			} else {
				employeeExists = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeExists;
	}

}
