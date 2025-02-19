package org.comit.practice._10_interfaces_abstractClasses;
/*
 * 5.	Write a Java program to create an abstract class Vehicle 
 * with abstract methods startEngine() and stopEngine(). 
 * Create subclasses, Car and Motorcycle, that extend the Vehicle class and 
 * implement the respective methods to start and stop the engines for each vehicle type.
 */

abstract class Vehicle {
	abstract void startEngine();
	abstract void stopEngine();
}

class Car extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Car - start Engine");		
	}

	@Override
	void stopEngine() {
		System.out.println("Car - stop Engine");			
	}	
}

class Motorcycle extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Motorcycle - start Engine");		
	}

	@Override
	void stopEngine() {
		System.out.println("Motorcycle - stop Engine");			
	}	
}

public class Ex05 {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.startEngine();
		car.stopEngine();
		
		Vehicle moto = new Motorcycle();
		moto.startEngine();
		moto.stopEngine();
	}

}
