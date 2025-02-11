package org.comit.practice._06_practice_oop;

class Person {
	String name;
	int age;
	
	public Person() { }
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.printf("Name: %s, Age: %d%n" , name, age);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		/* 
		 * 1.	Write a Java program to create a class called "Person" with a name and age attribute. 
		 * Create two instances of the "Person" class, set their attributes using a constructor, 
		 * and print their name and age.
		 */
		
		Person p1 = new Person("Jenny", 41);
		p1.display();
		
		Person p2 = new Person("Tim", 35);
		p2.display();

	}

}
