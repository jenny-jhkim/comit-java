package org.comit.course._15_access_modifiers._03_default_same_package;

//Default access modifier is accessible only within the same package
class MyClass {
	int x = 10;
	
	void display () {
		System.out.println("Print x : " + x);
	}
}
