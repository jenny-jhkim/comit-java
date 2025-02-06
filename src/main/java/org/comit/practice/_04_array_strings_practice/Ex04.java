package org.comit.practice._04_array_strings_practice;

public class Ex04 {

	public static void main(String[] args) {
		/* 4.	Write a Java program to find the index of value 4 in the array. */
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int value = 4;
		int index = -1; //-1: not found
		
		for(int i=0; i<array.length; i++) {
			if (value == array[i]) {
				index = i;
				break;
			}
		}
		
		System.out.printf("The value %d was found at index: %d%n", value, index);

	}

}
