package com.oracle.springtraining.constructorinjection;

public class Payment {
	
	private SavingsAccount savingsAccount;
	
	public Payment() {
	}
	public void pay(){
	
		System.out.println("Payment using constructor injecting ->"+ this.savingsAccount.getDetails());
	}
	
	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
}
