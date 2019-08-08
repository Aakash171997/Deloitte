package com.wrapperClass;

public class Demo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String n = "90";
		
		int i = Integer.parseInt(n);
		
		System.out.println(i+5);
		
		//Boxing
		Integer n1 = new Integer(i);
		
		//Unboxing
		int n2 = n1.intValue();
		
		n1 = 20;
		System.out.println(n1);

	}

}
