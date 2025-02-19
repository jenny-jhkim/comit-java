package org.comit.practice._10_interfaces_abstractClasses;
/* 
 * 2.	Write a Java program to create an Animal interface with a method called speak()
 *  that takes no arguments and returns void.
 *  Create a Dog class that implements Animal and overrides speak() to print "Dog is barking."
 */

interface Animal {
	void speak();
}

class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Dog is barking");		
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		
		dog.speak();

	}

}
