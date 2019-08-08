package com.oracle.springtraining.setterinjection;

public class Client {

	public static void main(String[] args) {
		Payment payment = new Assembler().getPaymentObj();
		payment.pay();
	}
}
