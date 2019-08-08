package com.oracle.springtraining.setterinjection;

public class Assembler {

	public Payment getPaymentObj(){
		
		SavingsAccount account = new SavingsAccount();
		//injection using constructor
		Payment payment = new Payment(account);
		return payment;
	}
}
