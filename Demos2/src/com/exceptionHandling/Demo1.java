package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	
	public void display() {
		System.out.println("Display started");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		try {
			int j = scan.nextInt();
			i= 10/j;
		} catch(ArithmeticException e) {
			System.out.println("0 entered. i = inf");
		} catch(InputMismatchException e) {
			System.out.println("Please enter a number!");
		} finally {
			System.out.println("i="+i);
			scan.close(); 
		}
		System.out.println("Display Ended");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		new Demo1().display();
		System.out.println("Main Ended");

	}

}
