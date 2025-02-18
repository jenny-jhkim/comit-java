package org.comit.practice._07_overloading_inheritance_overriding;
/*
 * 2.	Write a Java program to create a base class called Animal (Animal Family)
 *  with a method called sound() that returns void. 
 *  Create two subclasses, Bird and Cat. 
 *  Override each subclass's sound() method to make a specific sound for each animal.
 * 
 */

class Animal {
	void sound() {
		System.out.println("Base Animal sound");
	}
}

class Bird extends Animal {
	@Override
	void sound() {
		System.out.println("Tweet");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sound();
		
		Bird bird = new Bird();
		bird.sound();
		
		Cat cat = new Cat();
		cat.sound();
	}

}
