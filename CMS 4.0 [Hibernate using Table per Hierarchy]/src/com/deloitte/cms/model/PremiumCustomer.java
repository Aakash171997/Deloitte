package com.deloitte.cms.model;

public class PremiumCustomer extends Customer {
	private static final long serialVersionUID = 1L;
	
	private int rewardPoints;
	
	public PremiumCustomer() {
		
	}

	public PremiumCustomer(int customerId, String customerName, String customerAddress, int billAmount) {
		super(customerId, customerName, customerAddress, billAmount);
		// TODO Auto-generated constructor stub
	}

	public PremiumCustomer(int customerId) {
		super(customerId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + rewardPoints;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PremiumCustomer other = (PremiumCustomer) obj;
		if (rewardPoints != other.rewardPoints)
			return false;
		return true;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public String toString() {
		return "customerId: " + super.getCustomerId() + ", customerName: " + super.getCustomerName() + ", customerAddress: "
				+ super.getCustomerAddress() + ", billAmount: " + super.getBillAmount()+"PremiumCustomer [rewardPoints=" + rewardPoints + "]";
	}
	
}
