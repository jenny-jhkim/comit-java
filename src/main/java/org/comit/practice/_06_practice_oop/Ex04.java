package org.comit.practice._06_practice_oop;

class Circle {
	double radius;
	final double PI = 3.14;

	/**
	 * @param radius
	 */
	Circle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return PI * radius * radius; //Area = πr²
	}
	
	double getCircumference() {
		return 2 * PI * radius; // Circumference = 2πr
	}
}

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4.	Write a Java program to create a class called "Circle" with a radius attribute. 
		 * You can access and modify this attribute. 
		 * Create methods to find the area and circumference of the circle. 
		 * Create an object of “Circle”, set a value for the radius and display the area and circumference. 
		 */
		
		Circle c = new Circle(3.5);
		System.out.printf("The Area of circle: %.2f, circumference: %.2f", c.getArea(), c.getCircumference());

	}

}
