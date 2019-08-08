package com.oracle.springtraining.coupling1.factorysolution;

public class LoanAccount implements Account{
	
	private String accountNumber;
	private String loanDuration;
	
	
	
	public LoanAccount(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getLoanDuration() {
		return loanDuration;
	}
	
	@Override
	public String getDetails() {
		System.out.println("Loan Account getDetails() called");
		return accountNumber;
	}
	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}
	
}
