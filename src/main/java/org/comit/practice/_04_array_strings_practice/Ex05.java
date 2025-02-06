package org.comit.practice._04_array_strings_practice;

public class Ex05 {

	public static void main(String[] args) {
		/* 5.	Write a Java program to find the maximum and minimum values in the array. */
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int minimum = array[0];
		int maximum = array[0];
		
		for(int i=0; i<array.length; i++) {
			if (minimum > array[i]) {
				minimum = array[i];
			} else if (maximum < array[i]) {
				maximum = array[i];
			}
		}
		
		System.out.printf("Maximum value: %d, Minimum value: %d%n",maximum, minimum);

	}

}
