package com.oracle.springtraining.coupling1.factorysolution;

public class PaymentService {
	
	private Account account;
	
	public PaymentService(String accountType) {
		account = new AccountFactory()
		.manufactureAccount(accountType);
	}
	public void pay(){
	
		System.out.println("Payment using tight coupling ->"+ this.account.getDetails());
	}
}
