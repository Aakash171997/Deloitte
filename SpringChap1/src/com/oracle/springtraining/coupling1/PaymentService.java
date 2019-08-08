package com.oracle.springtraining.coupling1;

public class PaymentService {
	
	private SavingsAccount savingsAccount;
	
	public PaymentService(String accNumber) {
		savingsAccount = new SavingsAccount(accNumber);
	}
	public void pay(int amount){
	
		System.out.println("Paid to->"+ this.savingsAccount.getDetails()+" Amount INR: "+amount);
	}
}
