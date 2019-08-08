package com.singletonDesign;

public class Payment {
	
	static Payment payment = new Payment();
	
	//Private constructor, to prohibit creation of additional objects
	private Payment() {
		System.out.println("Object created");
	}
	
	//Object returning method
	public static Payment getObject() {
		return payment;
	}
	
	public void pay(int amount) {
		System.out.println("Payment of INR: "+amount+" completed");
	}
	
}
