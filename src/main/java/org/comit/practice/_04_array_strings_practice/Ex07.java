package org.comit.practice._04_array_strings_practice;

public class Ex07 {

	public static void main(String[] args) {
		/* 7.	Write a Java program to find the number of even and odd integers in the array. */
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int even = 0;
		int odd = 0;
		
		for(int i=0; i<array.length; i++) {
			if (array[i] % 2 == 0) {
				even++;
			} 
			else {
				odd++;
			}
		}
		
		System.out.printf("The number of even integers: %d, odd integers: %d%n", even, odd);
	

	}

}
