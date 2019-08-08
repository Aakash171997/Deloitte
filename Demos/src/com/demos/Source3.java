package com.demos;

class Animal{
	int age = 100;
	
	public void eat() {
		System.out.println("Animal Eats");
	}
}

class Cat{
	public void dd() {
		Animal a = new Animal();
		a.eat();
		a.age = 10;
	}
}

class P extends Animal{
	public void dd() {
		age = 10;
	}
}

public class Source3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
