package org.comit.course._09_inheritance;

/*
 * Inheritance is when a class acquires other class's attributes and methods.
 * Constructors are not inherited.
 * 
 * A class can ONLY extend ONE class
 */

/*
 * Parent, Super or Base - The class we inherit from
 */
class Person {
	private String name;
	private int age;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	void display() {
		System.out.printf("Name: %s, Age: %d%n", name, age);
	}
}

/*
 * Child, Subclass, Derivative Class - This is the class that inherits the other class' members
 */
class Employee extends Person {
	int id;
	String position;
	double salary;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}	

	
	//Overriding happens when we have a method with the same name and parameters type in the child class
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println( "ID: "+ id+" - " + position + " - " + salary);
	}
	
	@Override
	public String toString() {
		return String.format("Employee [id=%s, position=%s, salary=%s, name()=%s, age()=%s]", id, position,
				salary, getName(), getAge());
	}
	
	
}

class GrandChild extends Employee { //Multi-level inheritance
	
}

class GrandGrandChild extends GrandChild {
	
}

public class Inheritance {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("John");
		emp1.setAge(30);
		emp1.setId(1010);
		emp1.setPosition("Manager");
		emp1.setSalary(100_000);
		
		emp1.display();
		System.out.println(emp1);


	}

}
