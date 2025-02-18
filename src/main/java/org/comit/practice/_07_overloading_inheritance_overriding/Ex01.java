package org.comit.practice._07_overloading_inheritance_overriding;
class Helper {
	
	/*
	 * The first method receives an int and returns it converted into a String. 
	 */
	String formatNumber(int num) {
		return String.valueOf(num);
	}
	
	/*
	 * The second method takes a double, formats the number with 3 decimal places and returns it as a String.
	 */
	String formatNumber(double num) {
		
		return String.format( "%.3f", num);
	}
	
	/*
	 * The third method takes a String (the String contains a decimal number), 
	 * formats the number with 2 decimal places and returns it as a String.
	 */
	String formatNumber(String str) {
		double num = Double.parseDouble(str);
		return String.format("%.2f", num);
	}
}


public class Ex01 {

	public static void main(String[] args) {
		/* 
		 * 1.	Write a Java program to create a class 
		 * called "Helper" with three overloaded methods. 
		 * The method name is formatNumber(). 
		 */
		
		Helper myHelper = new Helper();
		
		//Method Overloading
		System.out.println(myHelper.formatNumber(12));
		System.out.println(myHelper.formatNumber(12.34567));
		System.out.println(myHelper.formatNumber("12.34567"));		

	}

}
