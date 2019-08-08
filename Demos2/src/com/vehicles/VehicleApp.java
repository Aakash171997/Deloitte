package com.vehicles;

class Vehicle{
	int modelNumber;
	
	public Vehicle(String carType) {
		System.out.println("Vehicle 2nd Cons called "+carType);
	}
}

class Car extends Vehicle{

	public Car() {
		super("GG");
		System.out.println("Car 1st cons");
	}
	
	public Car(String carType) {
		super(carType);
		System.out.println("Car second cons called  "+carType);
	}
}

public class VehicleApp {

	public static void main(String[] args) {
		Car car = new Car("Ford");

	}

}
