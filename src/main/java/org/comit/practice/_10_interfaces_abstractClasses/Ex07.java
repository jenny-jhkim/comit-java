package org.comit.practice._10_interfaces_abstractClasses;
/*
 * 7.	Write a Java program to implement an enum called "GeometricShape" 
 * with constants representing different geometric shapes.
 */

enum GeometricShape {
	CIRCLE, TRIANGLE, RECTANGLE, SQUARE, PENTAGON, HEXAGON
}

public class Ex07 {
	public static void main(String[] args) {
		GeometricShape myShape1 = GeometricShape.SQUARE;
		GeometricShape myShape2 = GeometricShape.PENTAGON;
		
		System.out.println("Shape1 : " + myShape1);
		System.out.println("Shape2 : " + myShape2);
	}
}
