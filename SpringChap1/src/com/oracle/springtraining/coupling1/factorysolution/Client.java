package com.oracle.springtraining.coupling1.factorysolution;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService(getUserInput());
		paymentService.pay();
	}
	public static String getUserInput(){
		Scanner sc = new Scanner(System.in);
		String option=null;
		System.out.println("Please enter the account type(S/C/L) to process the payment");
		option = sc.next();
		return option;
	}
}
