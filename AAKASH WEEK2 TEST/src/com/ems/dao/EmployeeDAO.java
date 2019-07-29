package com.ems.dao;

import java.util.List;
import com.ems.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();
	public int insertEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(String empId);
	public Employee getEmployeeById(String empId);
	public boolean employeeExists(String empId);
}
