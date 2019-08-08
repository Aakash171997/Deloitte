package com.oracle.springtraining.coupling1;

public class SavingsAccount {

	private String accountNumber;
	public SavingsAccount(String accountNUmber) {
		this.accountNumber = accountNUmber;
	}
	public String getDetails(){
		return accountNumber;
	}
}
