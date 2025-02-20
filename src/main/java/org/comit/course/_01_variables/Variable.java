package org.comit.course._01_variables;

import java.util.Scanner;

public class Variable {
	public static final double PI = 3.14159;
	public final int MAX_VALUE = 10;
	
	
	/**
	 * @param a
	 * @param b
	 */
	public void doSomething( int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		//Primitives - integer
		byte num1 = 100;
		short num2 = -32_000;		
		int num3 = 2_147_483_647;
		long num4 = 1456;
				
		//decimal
		float num5 = 123.45678901234567890f;
		double num6 = 123.45678901234567890;
		//System.out.println(num5);
		//System.out.println(num6);
		
		char chr1 = 'A';
		boolean boo1 = true;
		boolean boo2 = false;
		
	
		//Non-Primitives
		String str = null;	
		String str2 = new String("Hello");
		String str3 = new String("Hello");
//		System.out.println(str2==str3);
		
//		if (str == null) {
//			System.out.println("Please provide str:");
//			Scanner scan = new Scanner(System.in);
//			str = scan.nextLine();
//		}
//		System.out.println("The new value of str is : " + str);

		String str1 = "Hello";
		System.out.println("str length: " + str1.length() );
		System.out.println("str to upper case:" + str1.toUpperCase() );
		
	
		int r = 3;
		
		System.out.println("circle area: " + PI*r*r);
	}
	
}
