package org.comit.practice._04_array_strings_practice;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 3.	Write a Java program to test if the array contains the value 5. 
		 * Print out a message indicating if the value was found
		 */
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int value = 5;
		boolean found = false;
		
		for(int i=0; i<array.length; i++) {
			if (value == array[i]) {
				found = true;
				break;
			}
		}
		
		System.out.printf("The value %d was found: %b%n", value, found);
	}

}
