package org.comit.course._15_access_modifiers._03_default_members._01_same_package;

public class SamePackageMain {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
		//We can access the default member, methods of the class
		//because they are in the same package
		obj.display();
		System.out.println(obj.num);
	}

}
