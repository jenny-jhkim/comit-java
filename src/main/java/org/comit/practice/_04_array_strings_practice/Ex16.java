package org.comit.practice._04_array_strings_practice;

public class Ex16 {

	public static void main(String[] args) {
		/* 16.	Write a Java program 
		 * to check whether the following string has duplicate characters 
		 * (exclude blank spaces). */
		String str = "I love coding in Java";
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == ' '){
				//ignore blank spaces
				continue;
			}
			
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.printf("Duplicate characters '%c' found at indexes: %d, %d%n", str.charAt(i), i, j);
				}
			}
		}

	}

}
