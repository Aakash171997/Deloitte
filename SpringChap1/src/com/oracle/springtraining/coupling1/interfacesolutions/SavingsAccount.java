package com.oracle.springtraining.coupling1.interfacesolutions;

public class SavingsAccount implements Account{

	private String accountNumber;
	private String totalBalance;
	
	
	public SavingsAccount(String accountNUmber) {
		this.accountNumber = accountNUmber;
	}
	public String getDetails(){
		System.out.println("Saving Account getDetails() called");
		return accountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}
	
}
