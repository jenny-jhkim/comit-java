package org.comit.course._11_abstraction;

import java.util.ArrayList;

/*
 * An Interface is a template where we declare abstract methods (a method without a body)
 * 
 * An interface is like a contract that must be accomplished by a class 
 * 
 * A class can implement more than one interface at a time.
 * An interface can extend(inheritance)
 * 
 * 2014: Java 8 released
 * 
 */

//Step1 - declare a interface with abstract methods
interface Income {
	/*
	 * By default, all the attributes in the interface are constants. (public static final)
	 */
	int num = 4; 
	//public static final int NUM = 4; //Java
	
	/*
	 * All the methods in the interface are public abstract
	 */
	double calculatePay (double salary, double taxes);
	//public abstract double calculatePay (double salary, double taxes);
	
	default double calculatePay2(double salary, double taxes) {
		return salary - taxes;
	}
}

interface Hello {
	void sayHello();
}

//Step2 - declare a class that implements the interface
// (Implement all the abstract methods of the interface)
class Employee implements Income, Hello {

	@Override
	public double calculatePay(double salary, double taxes) {
		return salary - taxes;
	}
	
	
	void displayData() {
		System.out.println("I am an Employee");
		
	}
	
	double calculateBonus(double salary, double percentage) {
		return salary * percentage;
	}


	@Override
	public void sayHello() {
		 System.out.println("Hello, Welcome");
	}
	
}

public class _01_interfaces {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println( emp1.calculateBonus(80_000, 0.1) );
		
		//Step3 - use the interface as a type to expose only methods declared in the interface
		// If you create a object using the interface type, it only can access calculatePay() and hiding the rest
		Income emp2 = new Employee(); 
		System.out.println( emp2.calculatePay(80_000, 750));

		ArrayList<String> obj1 = new ArrayList<>();
		obj1.add("Hello");
		
	}

}
