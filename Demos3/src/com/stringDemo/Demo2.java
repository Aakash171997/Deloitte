package com.stringDemo;

public class Demo2 {

	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Anwesh Anjan");
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.capacity());
		
		name.append("            Patel");
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.capacity());

	}

}
