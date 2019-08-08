package com.demos;

import java.util.Scanner;

public class Source1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Enter the two numbers, separated by a space: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if ((num1 + num2)>=0) {
			System.out.printf("The sum is : %d", 
					num1+num2);
		} else {
			System.out.println("the sum is less than zero!");
		}
		
		scan.close();

	}

}
