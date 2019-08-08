package com.oracle.springtraining.coupling1.interfacesolutions;

public class PaymentService {
	
	private Account account;
	
	public PaymentService(String accountType) {
		if(accountType.equals("S"))
			account = new SavingsAccount("S123");
		else if(accountType.equals("C"))
			account = new CurrentAccount("C123");
		else if(accountType.equals("L"))
			account = new LoanAccount("L123");
	}
	public void pay(){
	
		System.out.println("Payment using tight coupling ->"+ this.account.getDetails());
	}
}
