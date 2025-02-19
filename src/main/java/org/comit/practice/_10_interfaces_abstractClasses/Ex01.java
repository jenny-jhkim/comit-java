package org.comit.practice._10_interfaces_abstractClasses;
/*
 * 1.	Write a Java program to create an interface Shape with the getArea() method. 
 * Create three classes, Square, Circle, and Triangle, implementing the Shape interface. 
 * Implement the getArea() method for each of the three classes.
 */

interface Shape {
	double getArea();
}

class Square implements Shape {

	double side;
	
	Square(double side){
		this.side = side;
	}
	
	@Override
	public double getArea() {	
		// A = a^2
		return Math.pow(this.side, 2);
	}
}

class Circle implements Shape {

	double radius;
	
	/**
	 * @param radius
	 */
	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// A = PI * r^2
		return Math.PI * Math.pow(this.radius, 2);
	}	
}

class Triangle implements Shape {
	
	double base;
	double height;
	
	/**
	 * @param base
	 * @param height
	 */
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2;
	}
	
}
public class Ex01 {

	public static void main(String[] args) {
		Shape square = new Square(5.5);
		System.out.println(square.getArea());

		Shape circle = new Circle(10);
		System.out.println(circle.getArea());
		
		Shape triangle = new Triangle(5, 8);
		System.out.println(triangle.getArea());

	}

}
