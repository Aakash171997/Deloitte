package com.singletonDesign;

public class PaymentApp {

	public static void main(String[] args) {
		Payment payment1 = Payment.getObject();
		Payment payment2 = Payment.getObject();
		Payment payment3 = Payment.getObject();

		payment1.pay(9000);
		payment2.pay(8000);
		payment3.pay(7000);


	}

}
