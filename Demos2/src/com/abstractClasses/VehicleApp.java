package com.abstractClasses;

abstract class Vehicle{
	
	public abstract void startVehicle();//Mandatory implementation
	
	public void musicSystem() {//Optional implementation
		System.out.println("Music");
	}
}

class Car extends Vehicle{

	@Override
	public void startVehicle() {
		System.out.println("Start Car");
		
	}
	
}

class Bike extends Vehicle{

	@Override
	public void startVehicle() {
		System.out.println("Start Bike");
		
	}
	
}

public class VehicleApp {

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		car.musicSystem();
		car.startVehicle();
		
		bike.startVehicle();

	}

}
