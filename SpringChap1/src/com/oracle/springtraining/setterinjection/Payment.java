package com.oracle.springtraining.setterinjection;

public class Payment {
	
	private SavingsAccount savingsAccount;
	
	public Payment(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	public void pay(){
	
		System.out.println("Payment using setter injecting ->"
		+ this.savingsAccount.getDetails());
	}
	

}
