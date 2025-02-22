package org.comit.course._15_access_modifiers._03_default_members._02_another_package;

import org.comit.course._15_access_modifiers._03_default_members._01_same_package.MyClass;

public class AnotherPackageMain {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		//We cannot access the default member, methods of the class
		//because they are in another package.
		//obj.display();
		//System.out.println(obj.num);

	}

}
