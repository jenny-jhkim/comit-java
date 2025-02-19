package org.comit.practice._10_interfaces_abstractClasses;

/*
 * 4.	Write a Java program to create an abstract class WildAnimal with an abstract void method called sound().
 *  Create subclasses Lion and Tiger that extend the WildAnimal class and 
 *  implement the sound() method to make a specific sound for each animal.
 */

abstract class WildAnimal {
	abstract void sound(); 
}

class Lion extends WildAnimal {

	@Override
	void sound() {
		System.out.println("Lion - Roar");
	}
}

class Tiger extends WildAnimal {

	@Override
	void sound() {
	System.out.println("Tiger - Growl");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		WildAnimal lion = new Lion();
		lion.sound();
		
		WildAnimal tiger = new Tiger();
		tiger.sound();
	}
}
