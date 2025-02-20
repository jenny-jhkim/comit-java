package org.comit.course._15_access_modifiers;

import org.comit.course._01_variables.Variable;

/*
 * The public access modifier is accessible from any other class in your project.
 * It can be used with classes, methods, and variables.
 */
public class _01_PublicExample {

	public static void main(String[] args) {
		Variable obj = new Variable();
		
		System.out.println("PI from other package: " + Variable.PI);
		System.out.println("MAX_VALUE from other package: " + obj.MAX_VALUE);
		obj.doSomething(2, 5);

	}

}
