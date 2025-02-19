package org.comit.practice._10_interfaces_abstractClasses;
/*
 * 3.	Write a Java program to create an interface Flyable with an abstract method called fly().
 * Create three classes, Spacecraft, Airplane, and Helicopter, implementing the Flyable interface. 
 * Implement the fly() method for each class.
 */

interface Flyable {
	void fly();
}

class Spacecraft implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly - Spacecraft");		
	}	
}

class Airplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly - Airplane");	
	}
}

class Helicopter implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly - Helicopter");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Flyable spacecraft = new Spacecraft();
		spacecraft.fly();
		
		Flyable airplane = new Airplane();
		airplane.fly();
		
		Flyable helicopter = new Helicopter();
		helicopter.fly();
	}
}
