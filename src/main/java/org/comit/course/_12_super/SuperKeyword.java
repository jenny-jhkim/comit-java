package org.comit.course._12_super;

/*
 * The super keyword is a reference variable that refers the immediate parent class.
 * 
 * with the super keyword :
 * 
 * 1. Access attributes of the parent class.
 * 2. call methods of the parent class.
 */
class Parent {
	String color = "Parent Color";
	
	void checkColor() {
		System.out.println("Parent - Blue");
	}
}

class Child extends Parent {
	String color = "Child Color"; //same name
	
	void displayColor() {
		System.out.println(this.color);
		System.out.println(super.color);
	}
	
	@Override
	void checkColor() {
		System.out.println("Child - Green");
		super.checkColor();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Child obj1 = new Child();
		obj1.displayColor();
		obj1.checkColor();
	}

}
