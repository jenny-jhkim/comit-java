package org.comit.practice._06_practice_oop;

class Rectangle {
	double width;
	double height;
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	double getWidth() {
		return width;
	}
	void setWidth(double width) {
		this.width = width;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	
	double getArea() {
		return this.width * this.height;
	}
	
	double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	

}
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 3.	Write a Java program to create a class called "Rectangle" with width and height attributes. 
		 * Create a parameterized constructor and two methods that find the area and perimeter of the rectangle. 
		 * Create an object of “Rectangle” and display the area and perimeter. 
		 */
		Rectangle r1 = new Rectangle(5, 8);
				
		System.out.printf("Area of Rectangle: %.2f, Perimeter: %.2f%n", r1.getArea(), r1.getPerimeter());
		
	}

}
