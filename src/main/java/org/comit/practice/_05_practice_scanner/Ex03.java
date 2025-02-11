package org.comit.practice._05_practice_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* 
		 * 3.	Write a program in Java that reads two numbers from the keyboard 
		 * and says which is the largest and which is the smallest.
		 */
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter first number: ");		
			double num1 = scanner.nextDouble();
			scanner.nextLine(); //clear the buffer (previous <Enter>)
			
			System.out.println("Enter second number: ");		
			double num2 = scanner.nextDouble();
			
			double temp;
			if( num1 < num2 ) {
				// assume num1 is bigger than num2
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			System.out.println("The largest number: " + num1 + ", the smallest number: " + num2 );
			
			scanner.close();
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid input");
			
		}

	}

}
