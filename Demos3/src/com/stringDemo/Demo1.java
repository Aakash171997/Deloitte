package com.stringDemo;

public class Demo1 {

	public static void main(String[] args) {
	
		String name = "Anwesh";
		
		System.out.println(name.charAt(4));
		System.out.println(name.concat(" Patel"));
		System.out.println(name.substring(2,5));
		
		String name2 = "Anwesh";
		String name3 = new String("Anwesh");
		
		System.out.println(name.equals(name2));
		System.out.println(name == name2);
		
		System.out.println(name.equals(name3));
		System.out.println(name == name3);
		
		name2 = "Anjan";
		
		System.out.println(name.compareTo(name2));
		
		System.out.println(name.length());
	}

}
