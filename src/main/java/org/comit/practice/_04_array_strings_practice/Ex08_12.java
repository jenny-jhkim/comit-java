package org.comit.practice._04_array_strings_practice;

public class Ex08_12 {

	public static void main(String[] args) {

		String str = "I love coding in Java";
		System.out.println("String: " + str);
		System.out.println(""); 
		
		/* 8.	Write a Java program to get the character at the index 7 within the following string.  */
		System.out.println("The character at the index 7: " + str.charAt(7));
		
		/* 9.	Write a Java program to get the character's ASCII code at the index 8 in the string.  */
		System.out.println("The character's ASCII code at the index 8: " + (int) str.charAt(8));
		
		/* 10.	Write a Java program to sum the character's ASCII codes of all the characters in the string. */
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += (int) str.charAt(i);
		}
		System.out.println("The sum of the character's ASCII codes in the string: " + sum);
		
		/* 11.	Write a Java program to check whether the string ends in “ava”. */
		System.out.printf("The string ends in 'ava': %b%n" , str.endsWith("ava"));
		
		/* 12.	Write a Java program to reverse the string. */
		String reverseStr = "";
		
		for(int i=0; i<str.length(); i++) {
			reverseStr = str.charAt(i) + reverseStr;
		}
		System.out.printf("Reverse string: %s" , reverseStr);
		
		
	}

}
