package com.deloitte.model;

import com.deloitte.exceptions.InvalidAddressException;
import com.deloitte.exceptions.InvalidCustIdException;
import com.deloitte.exceptions.InvalidNameException;
import com.deloitte.exceptions.NegativeAmountException;

public class Customer implements Comparable<Customer>{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	public Customer() {
	}

	public Customer(int customerId, String customerName, String customerAddress, int billAmount) throws NegativeAmountException, InvalidCustIdException, InvalidNameException, InvalidAddressException {
		super();
		
		if(customerId >= 1) {
			this.customerId = customerId;
		} else {
			throw new InvalidCustIdException("Invalid Customer ID. ID > 0");
		}
		
		if(customerName == null || customerName.equalsIgnoreCase("")) {
			throw new InvalidNameException("Invalid Name");
		} else {
			this.customerName = customerName;
		}
		
		if(customerAddress == null || customerAddress.equalsIgnoreCase("")) {
			throw new InvalidAddressException("Invalid Address");
		} else {
			this.customerAddress = customerAddress;
		}
		
		if(billAmount>0) {
			this.billAmount = billAmount;
		} else {
			throw new NegativeAmountException("Bill Amount is Negative");
		}
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) throws InvalidCustIdException {
		if(customerId >= 1) {
			this.customerId = customerId;
		} else {
			throw new InvalidCustIdException("Invalid Customer ID. ID > 0");
		}
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) throws InvalidNameException {
		if(customerName == null || customerName.equalsIgnoreCase("")) {
			throw new InvalidNameException("Invalid Name");
		} else {
			this.customerName = customerName;
		}
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) throws InvalidAddressException {
		if(customerAddress == null || customerAddress.equalsIgnoreCase("")) {
			throw new InvalidAddressException("Invalid Address");
		} else {
			this.customerAddress = customerAddress;
		}
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) throws NegativeAmountException {
		if(billAmount>0) {
			this.billAmount = billAmount;
		} else {
			throw new NegativeAmountException("Bill Amount is Negative");
		}
	}

	@Override
	public String toString() {
		return "\nCustomer Details : customerId : " + customerId + ", Name : " + customerName + ", Address : "
				+ customerAddress + ", Amount : " + billAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Customer o) {
		return this.getCustomerName().compareTo(o.getCustomerName());
	}
	
}
