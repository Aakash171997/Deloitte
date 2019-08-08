package com.inheritance;

public class AnimalApp {
	public static void main(String[] args) {
		Animal a = new Cat();
		
		a.eat();
		
		a = new Dog();
		
		a.eat();
	}
}
