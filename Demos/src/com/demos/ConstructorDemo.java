package com.demos;

class A{
	int i;
	double d;
	public A() {
		i = 10;
		System.out.println("A constructor called");
	}
	
	public A(int i) {
		this((double) 123.87);
		System.out.println(i);
		this.i = i;
		System.out.println("Parameterized (overloaded) cons called");
	}
	
	private A(double d) {
		this.d = d;
		System.out.println("Private constructor");
	}
	
	public void display() {
		System.out.println(this.i);
		System.out.println(this.d);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		
		new A().display(); //anonymous memory allocation
		
		A b = new A(20);
		b.display();

	}

}
