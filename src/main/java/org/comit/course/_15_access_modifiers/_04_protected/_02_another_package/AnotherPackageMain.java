package org.comit.course._15_access_modifiers._04_protected._02_another_package;

import org.comit.course._15_access_modifiers._04_protected._01_same_package.MyClass;

class AnotherPackageClass extends MyClass {
	
	//We can access to the protected members and protected methods
	//through inheritance from another package
	
	void doSomething() {
		this.num = 10;
		this.display();
	}
}

public class AnotherPackageMain {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		// MyClass class is in a different package
		// so we cannot access the protected members of the class
		//obj.display();
		//System.out.println(obj.num);

	}
}
