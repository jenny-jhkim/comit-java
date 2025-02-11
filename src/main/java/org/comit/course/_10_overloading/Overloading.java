package org.comit.course._10_overloading;

/*
 *Overloading is the situation where in the same class;
 *two or methods.constructors have the same name but different parameter type.
 *
 * We can ONLY overload constructors and methods
 */

class MyClass{

	int num;
	String str;
	
	/*
	 * Constructor Overloading - default / no-arg / parameterised
	 * Constructor have the same name but different parameter types or different number of parameters.
	 * (different signature)
	 */
	
	MyClass(){
		
	}

	MyClass(int num, String str) {
		//super();
		this.num = num;
		this.str = str;
	}
	
	MyClass(String str, int num) {
		//super();
		this.num = num;
		this.str = str;
	}

	MyClass(int num) {
		super();
		this.num = num;
	}
	
	MyClass(String str) {
		this.str = str;
	}
	
	/* 
	 * 2. Method Overloading
	 */
	String concat() {
		return this.str + " - " + this.num;
	}
	String concat(String str) {
		return this.str + " - " +str;
	}
	
	String concat(String str, int num) {
		return str + " - " + num;
		
	}
	
	String concat(int num, String str) {
		return str + " - " + num;		
	}
	
	/*
	 * Parts of a method
	 * 1. Declaration(return type, method name, parameters
	 * - Signature (method name, parameter types) - Java uses this signature if two methods are equal
	 * 2. Body (what you have between curly braces)
	 */
}


public class Overloading {

	public static void main(String[] args) {

		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass(10);
		MyClass c3 = new MyClass("Hello");
		MyClass c4 = new MyClass(1, "Hello1");
		MyClass c5 = new MyClass("Hello2", 2);
		
		System.out.println(c1.concat("Java Version", 21));
		System.out.println(c3.concat("comIT"));
		System.out.println(c4.concat());

	}

}
