package org.comit.course._11_abstraction;

/*
 * An abstract class is a class that can only be extended.
 * We cannot create objects of an abstract class.
 * 
 * An abstract class has abstract methods that can be implemented in classes
 * that extend (inherit) the abstract class.
 * 
 * So, because of that, sometimes it is better to implement an interface over extending an abstract class.
 */

abstract class MyAbstractClass {
	int num; //member variable
	
	//abstract methods (without a body) // implicitly public
	//must implement
	abstract void doSomething();
	
	//concrete methods ( with an implementation)
	void doSomething2() {
		System.out.println("I am doing something 2...");
	}
	
	final void doSomethingFinal() {
		System.out.println("I am doing something Final, cannot override. ");
	}
}

class MyChild extends MyAbstractClass {

	//must implement
	@Override
	void doSomething() {
		System.out.println("I am doing something!!!");
		
	}
	
	void doSomething3() {
		System.out.println("I am doing something 3");
	}
	
	
}
public class _02_abstractClasses {
	public static void main(String[] args) {
		MyChild ch1 = new MyChild();
		
		ch1.doSomething();
		ch1.doSomething2();
		ch1.doSomething3();
	}

}
