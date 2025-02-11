package org.comit.practice._05_practice_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* 1.	Write a program in Java that reads an integer from the keyboard and 
		 * sums all the following 100 numbers, including the number given, 
		 * showing the result on the screen. */
		try (
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the integer number: ");		
			int number = scanner.nextInt();
			int sum = 0;
			
			for(int i = 0; i<100; i++) {
				sum = number + i + sum;
			}
			
			System.out.println("The Sum of the following 100 numbers: " + sum);
			scanner.close();
		}				
 		catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid input");
			
		}
		

	}

}
