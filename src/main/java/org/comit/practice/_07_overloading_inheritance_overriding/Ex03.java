package org.comit.practice._07_overloading_inheritance_overriding;

/*
 * 3.	Write a Java program to create a base class MyShape with a method called calculateArea().
 *  Create three subclasses: MyCircle, MyRectangle, and MyTriangle. 
 * Override the calculateArea() method in each subclass to calculate and return the shape's area.
 */
class MyShape {
	double calculateArea() {
		return 0;
	}
}

class MyCircle extends MyShape {
	double radius;
	
	MyCircle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		//Area = PI * r^2
		return Math.PI * this.radius * this.radius;		
	}
}

class MyRectangle extends MyShape {
	double length;
	double width;
	
	/**
	 * @param length
	 * @param width
	 */
	MyRectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	double calculateArea() {
		//Area = length * width
		return this.length * this.width;
	}
}

class MyTriangle extends MyShape {
	double base;
	double height;
	/**
	 * @param base
	 * @param height
	 */
	MyTriangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	double calculateArea() {
		//Area = (base * height) /2
		return (this.base * this.height) /2;
	}	
}

public class Ex03 {
	public static void main(String[] args) {
		MyCircle circle = new MyCircle(5.1);
		System.out.printf("Area of the circle: %.3f %n", circle.calculateArea());
		
		MyRectangle rectangle = new MyRectangle(5.1, 6.7);
		System.out.printf("Area of the rectangle: %.3f %n", rectangle.calculateArea());
		
		MyTriangle triangle = new MyTriangle(5.1, 6.7);
		System.out.printf("Area of the triangle: %.3f %n", triangle.calculateArea());
		
	}	
}
