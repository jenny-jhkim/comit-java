package org.comit.course._15_access_modifiers._04_protected._01_same_package;

public class SamePackageMain {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		//MyClass can access in the same package
		obj.display();
		System.out.println(obj.num);
	}
}
