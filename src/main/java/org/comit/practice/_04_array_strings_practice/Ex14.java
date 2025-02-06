package org.comit.practice._04_array_strings_practice;

public class Ex14 {

	public static void main(String[] args) {
		/* 14.	Write a Java program to get the index of all the alphabet characters in the following string. */
		String str = "The quick brown fox jumps over the lazy dog.";
		
		/*
		 * The alphabet goes from a to z.
		 * The ASCCI code of 'a' is 97 and 'z' is 122.
		 */
		for (int i=97; i<=122; ++i) {
			
			System.out.printf("%c : %d%n", i, str.indexOf(i)); 
		}
	}

}
