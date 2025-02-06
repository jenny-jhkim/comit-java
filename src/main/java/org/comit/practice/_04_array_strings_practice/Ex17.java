package org.comit.practice._04_array_strings_practice;

public class Ex17 {

	public static void main(String[] args) {
		/* 17.	Write a Java program 
		 * to check whether the character “z” is happy or not in the following string. 
		 * A character is happy when the same character appears to its left or right in a string. */
		
		String str = "azzlea";
		char ch = 'z';
		boolean isHappy = false;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				if( i > 0 && str.charAt(i-1) == ch) { //left side
					isHappy = true;
				} 
				if (i < str.length()-1 && str.charAt(i+1) == ch) { //right side
					isHappy = true;
				}
			}

		}
		System.out.println("Original String: " + str);
		System.out.printf("The character '%c' is happy: %b%n", ch, isHappy);

	}

}
