package com.oracle.springtraining.constructorinjection;

public class Assembler {

	public Payment getPaymentObj(){
		
		SavingsAccount account = new SavingsAccount();
		Payment payment = new Payment();
		payment.setSavingsAccount(account);
		return payment;
	}
}
