package org.comit.practice._06_practice_oop;

class Dog {
	String name;
	String breed;
	
	public Dog() {}
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getBreed() {
		return breed;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void display() {
		System.out.printf("Name: %s, Breed: %s%n", name, breed);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		/* 
		 * 2.	Write a Java program to create a class called "Dog" with a name and breed attribute.
		 *  Create two instances of the "Dog" class, set their attributes using the constructor, 
		 *  modify them using the setter methods and print the updated values.
		 */
		
		Dog d1 = new Dog("Toby", "Bichon");
		d1.setName("Toby 1");
		d1.setBreed("Small Bichon");
		d1.display();
		
		Dog d2 = new Dog("Coco", "Sheperd");
		d2.setName("Coco 1");
		d2.setBreed("Big Shepard");
		d2.display();
	}

}
