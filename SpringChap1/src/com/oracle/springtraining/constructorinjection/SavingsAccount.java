package com.oracle.springtraining.constructorinjection;

public class SavingsAccount {

	private String accountNumber;
	public SavingsAccount() {
		accountNumber="S1234";
	}
	public SavingsAccount(String accountNUmber) {
		this.accountNumber = accountNUmber;
	}
	public String getDetails(){
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
}
