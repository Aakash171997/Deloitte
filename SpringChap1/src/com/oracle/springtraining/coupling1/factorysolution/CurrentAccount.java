package com.oracle.springtraining.coupling1.factorysolution;

public class CurrentAccount implements Account{
	
	private String accountNumber;
	private String dailyLimit;
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public CurrentAccount(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}


	@Override
	public String getDetails() {
		System.out.println("Current Account getDetails() called");
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(String dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
	
}
