package com.innerDemo;

class A{
	int i;
	class B{
		int j;
		
		public void display() {
			System.out.println("B display called");
			i = 100; j = 200;
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.display();

	}

}
