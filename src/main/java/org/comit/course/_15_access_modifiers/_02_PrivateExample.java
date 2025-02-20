package org.comit.course._15_access_modifiers;

/*
 * The private access modifier is accessible only within the class in which it is declared.
 * It can be used with variables, methods, and constructors.
 * Private members cannot be inherited. 
 * A class cannot be private.
 * 
 * Private constructor is used to prevent the creation of objects. 
 * For instance, when all the members in a class are static. Ex) Math class
 */

class MyClass {
	private int x = 10;
	
//	private MyClass() {
//		System.out.println("Private constructor");
//	}
	
	private void displayX() {
		System.out.println("Display: " + x);
	}
	
	void display() {
		displayX();
	}
}

class MyChild extends MyClass {
	void displayMyChild() {
		display();
	}
}

public class _02_PrivateExample {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		//ERROR : private variable and method cannot visible. cannot access
		//System.out.println(obj.x);
		//obj.display();
		
		obj.display();
		
		MyChild obj2 = new MyChild();
		obj2.displayMyChild();

	}

}
