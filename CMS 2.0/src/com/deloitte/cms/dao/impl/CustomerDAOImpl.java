package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.entities.Customer;
import com.deloitte.utilities.CustomerDBUtility;

public class CustomerDAOImpl implements CustomerDAO {
	
	private final String SELECT_CUSTOMER_QUERY = 
			"select * from HR.customer where customerID=?";
	private final String ALL_CUSTOMERS_QUERY = "select * from HR.customer";
	private final String INSERT_CUSTOMER_QUERY = 
			"insert into HR.customer values(?,?,?,?)";
	private final String UPDATE_CUSTOMER_QUERY = "update HR.customer "
			+ "set customerID=?, customerName=?, customerAddress=?, BillAmount=? "
			+ "where customerId=?";
	private final String DELETE_CUSTOMER_QUERY = 
			"delete from HR.customer where customerID=?";
	
	@Override
	public List<Customer> getAllCustomers() {
		Connection conn = CustomerDBUtility.dbConnect();
		PreparedStatement statement;
		List<Customer> customerList = new ArrayList<Customer>();
		
		try {
			statement = conn.prepareStatement(ALL_CUSTOMERS_QUERY);
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				customerList.add(new Customer(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customerList;
	}

	@Override
	public int insertCustomer(Customer customer) {
		Connection conn = CustomerDBUtility.dbConnect();
		PreparedStatement statement;
		int rows = 0;
		
		try {
			statement = conn.prepareStatement(INSERT_CUSTOMER_QUERY);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getCustomerAddress());
			statement.setInt(4, customer.getBillAmount());
			
			rows = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public int updateCustomer(Customer customer) {
		if (this.customerExists(customer.getCustomerId())) {
			Connection conn = CustomerDBUtility.dbConnect();
			PreparedStatement statement;
			int rows = 0;
			
			try {
				statement = conn.prepareStatement(UPDATE_CUSTOMER_QUERY);
				statement.setInt(1, customer.getCustomerId());
				statement.setString(2, customer.getCustomerName());
				statement.setString(3, customer.getCustomerAddress());
				statement.setInt(4, customer.getBillAmount());
				statement.setInt(5, customer.getCustomerId());
				
				rows = statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rows;
		} else {
			return 0;
		}
		
	}

	@Override
	public int deleteCustomer(int customerId) {
		if(this.customerExists(customerId)) {
			Connection conn = CustomerDBUtility.dbConnect();
			PreparedStatement statement;
			int rows = 0;
			
			try {
				statement = conn.prepareStatement(DELETE_CUSTOMER_QUERY);
				statement.setInt(1, customerId);
				rows = statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return rows;
		} else {
			return 0;
		}
	}

	@Override
	public Customer seachCustomerById(int customerId) {
		if(this.customerExists(customerId)) {
			Connection conn = CustomerDBUtility.dbConnect();
			PreparedStatement statement;
			Customer customer=null;
			
			try {
				statement = conn.prepareStatement(SELECT_CUSTOMER_QUERY);
				statement.setInt(1, customerId);
				
				ResultSet set = statement.executeQuery();
				set.next();
				customer = new Customer(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4));
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return customer;
		} else {
			return null;
		}
		
	}

	@Override
	public boolean customerExists(int customerId) {
		Connection conn = CustomerDBUtility.dbConnect();
		PreparedStatement statement;
		boolean customerExists = false;
		
		try {
			statement = conn.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			
			ResultSet set = statement.executeQuery();
			
			if(set.next()) {
				customerExists = true;
			} else {
				customerExists = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerExists;
	}
}
