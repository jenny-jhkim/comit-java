package org.comit.course._08_oop;

/*
 * A class is a construction map or blueprint for creating objects
 * 
 * A class has three types of members
 * 
 * 1. Attributes
 * 2. Methods
 * 3. Constructors
 */


public class Employee {
	/*
	 * Attributes - Fields, Properties, Instance variables
	 */
	
	private int id;
	private String name;
	private double salary;
	private String position;
	
	/*
	 * Constructors are special methods used for initialising objects.
	 * Constructors are called automatically when we create an object.
	 * 
	 * A constructor has the same name of the Class and returns nothing.
	 * 
	 * Types:
	 *  1. Default - is created by Java when a class doesn't have any constructor.
	 *  2. No-argument - is created by hand and it is like the default constructor.
	 *  3. parameterised - is created by hand and has one or more parameters.
	 */
	Employee() {
		super();
	}
	
	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	
	Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/*
	 * Method - a block of code that runs when it is called
	 * return_type method_name ( parameters ) { body_of_the_method } 
	 */	

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	//Method Declaration: double getBonus(double percentage) 
	//Method Signature: getBonus(double percentage) 
	//In Java, if a Method Signature is the same, it is treated as the same method.
	//
	//Polymorphism - Method overloading
	double getBonus(double percentage) {		
		return (salary * percentage) / 100;		
	}
	
	double getBonus(int percentage1) {	
		double local = (salary * percentage1) / 100;		
		return local;
	}
	
	
	void display() {
		System.out.printf("ID:%5d, Name: %s%n",id, name);
		System.out.println("Salary: " + salary);
		System.out.println("Position: " + position);
	}
	
}
