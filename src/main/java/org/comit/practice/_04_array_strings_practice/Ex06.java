package org.comit.practice._04_array_strings_practice;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		/* 6.	Write a Java program to reverse the array. */
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int[] reverse = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			reverse[array.length - 1 - i] = array[i];
		}
		System.out.println("Original array : " + Arrays.toString(array));
		System.out.println("Reverse array : " + Arrays.toString(reverse));
				
	}

}
