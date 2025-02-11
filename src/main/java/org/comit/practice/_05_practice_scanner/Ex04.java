package org.comit.practice._05_practice_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4.	Write a Java program that reads 10 integer numbers from the keyboard to print the average.
		 */
		
		int[] numbers = new int[10];
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enger 10 integer numbers");
			
			int sum = 0;
			
			for(int i=0; i<10; i++) {
				numbers[i] = scanner.nextInt();
				scanner.nextLine(); //clear the buffer (previous <Enter>)
				sum += numbers[i];
			}
			
			System.out.println("Average is : " + sum/numbers.length);
			scanner.close();

		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

	}

}
