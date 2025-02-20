package org.comit.course._15_access_modifiers._03_default_another_package;

import org.comit.course._15_access_modifiers._03_default_same_package.MyPublicClass;

//import org.comit.course._15_access_modifiers._03_default_same_package.MyClass;

public class AnotherPackageClass {

	public static void main(String[] args) {
		//MyClass class is in a different package, it cannot access from another package.
		//MyClass obj = new MyClass();
		//obj.display();
		
		
		//If you want to access in a different package, that class should be public
		MyPublicClass obj = new MyPublicClass();
		obj.display();
		
	}

}
