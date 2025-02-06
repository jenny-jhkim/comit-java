package org.comit.course._06_arrays;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//Declare an array with initial value
		//Arrays are not re-sizable. Once you declare an array, you cannot change its size.
		int[] array = { 4, 5, 6, 2, 14, 35, 46, 71, 28, 19};
//		System.out.println(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		System.out.println("*****");
		//classic for loop
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("*****");
		//Enhanced for loop
		for (int num: array) {
			System.out.println(num);
		}
		
		System.out.println("*****");
		/* Multi-dimentions arrays 
		 * an array of arrays 
		 * */
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for(int i=0; i<matrix.length; i++) {
			for( int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println(" ");
		}
		
		System.out.println("*****");
		//Declare and allocate memory for an array without initial value
		//Java is automatically assigned with 0
		int[] array2 = new int[10];
		System.out.println(Arrays.toString(array2));
		System.out.println( array.length );
		
//		//int array3[] = new int[3]; //valid, but do not use this way. [] is after data type.
		
		String[] names = {"John", "Jane", "Doe"};
		System.out.println(Arrays.toString(names));
		
		String[] names2 = new String[3];
		System.out.println(Arrays.toString(names2));
				
		
		
	}

}
