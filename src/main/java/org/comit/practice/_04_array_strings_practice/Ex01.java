package org.comit.practice._04_array_strings_practice;

public class Ex01 {

	public static void main(String[] args) {
		/* 1.	Write a Java program to sum the values of the array. Print out the sum.    */
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("Sum of the array: " + sum);

	}

}
