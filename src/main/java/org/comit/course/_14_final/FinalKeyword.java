package org.comit.course._14_final;

class Constants {
	
	// Final instance variable cannot be modified
	final int MAX_VALUE = 100; // Constant value

	void show(){
	// MAX_VALUE = 200; 
	// ERROR: Cannot change final variable
	   
		//Final local variable
		final int x;
		x = 10;
		//x = 20; // ERROR: Cannot change final variable
		System.out.println("MAX_VALUE: " + MAX_VALUE);
	}
	
	//Final Method	
	final void doNotModify() {
		System.out.println("This is a final method");
	}
}

class Child extends Constants {

	// ERROR: final method cannot be overridden by subclasses
//	@Override
//	void doNotModify() {
//		System.out.println("Trying to override");
//	}
}

//Final Class
final class FinalParent {
	void doSomething() {
		System.out.println("This is in the final class");
	}
}

//class SubClass extends FinalParent {
//	ERROR: Cannot inherit from final class
//}

public class FinalKeyword {

	public static void main(String[] args) {
		FinalParent obj = new FinalParent();
		obj.doSomething();
		
		Constants con = new Constants();
		con.show();
		con.doNotModify();

	}

}
