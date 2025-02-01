package org.comit.course._06_arrays;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//Declare an array with initial value
		//Arrays are not re-sizable. Once you declare an array, you cannot change its size.
		int[] array = { 4, 5, 6, 2, 14, 35, 46, 71, 28, 19};
//		System.out.println(array);
		System.out.println(Arrays.toString(array));

		//Declare and allocate memory for an array without initial value
		//Java is automatically assigned with 0
		int[] array2 = new int[10];
		System.out.println(Arrays.toString(array2));
		
		String[] names = {"John", "Jane", "Doe"};
		System.out.println(Arrays.toString(names));
		
		String[] names2 = new String[3];
		System.out.println(Arrays.toString(names2));
				
		
		
	}

}
