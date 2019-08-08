package com.oracle.springtraining.constructorinjection;

public class Client {

	public static void main(String[] args) {
		Payment payment = new Assembler().getPaymentObj();
		payment.pay();
	}
}
