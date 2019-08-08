package cust;

public class Customer {
	private int custID;
	private String custName, custAddress;
	private double billAmount;
	
	public Customer() {
	
	}

	public Customer(int custID, String custName, String custAddress, double billAmount) {
		this.custID = custID;
		this.custName = custName;
		this.custAddress = custAddress;
		this.billAmount = billAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(billAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((custAddress == null) ? 0 : custAddress.hashCode());
		result = prime * result + custID;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
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
		if (Double.doubleToLongBits(billAmount) != Double.doubleToLongBits(other.billAmount))
			return false;
		if (custAddress == null) {
			if (other.custAddress != null)
				return false;
		} else if (!custAddress.equals(other.custAddress))
			return false;
		if (custID != other.custID)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", billAmount=" + billAmount + "]";
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
}
