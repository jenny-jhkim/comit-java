package org.comit.practice._04_array_strings_practice;

public class Ex02 {

	public static void main(String[] args) {
		/* 
		 * 2.	Write a Java program to calculate the average value of the array elements.
		 * Print out the average value. 
		 */
		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		int average = sum/array.length;
		
		System.out.println("Sum of the array: " + sum);

	}

}
