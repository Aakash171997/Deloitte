package com.exceptionHandling;

public class Demo3 {
	
	public void display() {
		System.out.println("Display started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Something");
		}
		System.out.println("Display Ended");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		new Demo3().display();
		System.out.println("Main Ended");

	}

}
