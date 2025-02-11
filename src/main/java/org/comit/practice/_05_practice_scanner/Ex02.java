package org.comit.practice._05_practice_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* 2.	Write a program in Java 
		 * that converts from Canadian dollars to US dollars. 
		 * You will get a decimal number corresponding to the amount in CAD from the keyboard and 
		 * print out an answer with the corresponding amount in US dollars. 
		 * Use today’s exchange rate. 
		 * Note: Use the scanner class to get the User input. */
		

		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter in amount of CAD: ");
			double cad = scanner.nextDouble();
			double exchangeRate = 0.70;
			
			double usd = cad * exchangeRate;
			
			System.out.printf("The amount in USD is $%.2f, exchange rate: %.2f", usd, exchangeRate );
			scanner.close();
			
		} catch (InputMismatchException e ) {
			System.out.println("Invalid input. Please enter a valid input. Error: " + e);
		}

	}

}
