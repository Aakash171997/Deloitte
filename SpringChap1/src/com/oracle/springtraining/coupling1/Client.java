package com.oracle.springtraining.coupling1;

public class Client {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService("SG192719");
		paymentService.pay(354354);
	}
}
