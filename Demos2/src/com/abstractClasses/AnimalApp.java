package com.abstractClasses;

abstract class Animal{
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void move();
	public void sleep() {
		System.out.println("Animal Sleeps");
	}
}

abstract class Feline extends Animal{

	@Override
	public void move() {
		System.out.println("Cat-walk");
		
	}
	
}

class Cat extends Feline{

	@Override
	public void makeNoise() {
		System.out.println("Meow");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats fish");
		
	}
	
}

class Tiger extends Feline{

	@Override
	public void makeNoise() {
		System.out.println("Roar");
		
	}

	@Override
	public void eat() {
		System.out.println("Tiger eats meat");
		
	}
	
}

abstract class Canine extends Animal{
	@Override
	public void move() {
		System.out.println("Trot");
		
	}
}

class Wolf extends Canine{

	@Override
	public void makeNoise() {
		System.out.println("Howl");
		
	}

	@Override
	public void eat() {
		System.out.println("Wolf eats meat");
		
	}
	
}

class Dog extends Canine{

	@Override
	public void makeNoise() {
		System.out.println("Bark");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eats everything");
		
	}
	
}

abstract class Hippo extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Hippo sound");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Hippo eats");
		
	}
}

public class AnimalApp {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.makeNoise();
		cat.move();
		
		Dog dog = new Dog();
		dog.eat();
		dog.makeNoise();
		dog.move();
		
		Tiger tiger =  new Tiger();
		tiger.eat();
		tiger.move();
		tiger.makeNoise();
		
		Wolf wolf = new Wolf();
		wolf.eat();
		wolf.makeNoise();
		wolf.move();

	}

}