package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	
	public int display() {
		System.out.println("Display started");
		Scanner scan = new Scanner(System.in);
		int i = 10;
		try {
			i++;
			if(i==11) {
				return i;
			}
		} catch(ArithmeticException e) {
			System.out.println("0 entered. i = inf");
		} catch(InputMismatchException e) {
			System.out.println("Please enter a number!");
		} finally {
			System.out.println("i="+i);
			scan.close(); 
		}
		System.out.println("Display Ended");
		return i;
	}
	
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		System.out.println("Main Ended "+demo.display());

	}

}
