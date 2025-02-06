package org.comit.practice._04_array_strings_practice;

public class Ex15 {

	public static void main(String[] args) {
		/* 15.	Write a Java program 
		 * to check whether the first two characters appear at the end of the following string. */
		
		String str = "educated";
		
		String firstTwo = str.substring(0,2);
		String lastTwo = str.substring(str.length()-2);
		
		System.out.println("Original String: " + str);
		System.out.printf("The first two characters '%s' appear at the end of the string: %b%n", firstTwo, firstTwo.equals(lastTwo));
		
		

	}

}
