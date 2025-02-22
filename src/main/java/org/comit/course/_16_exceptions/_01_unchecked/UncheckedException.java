package org.comit.course._16_exceptions._01_unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		
		//Unchecked Exception is a subclass of RuntimeException.
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter an integer number: ");
			
			int number = scanner.nextInt();
						
			int result = 10 / number;
			
			String str = null;
			
			System.out.println("Result: " + result);
		} catch (ArithmeticException | InputMismatchException | NullPointerException ex ) {
			
			System.out.println("Dear user, the input is invalid. Please enter a valid integer number.");
			
			/*
			 * The printStackTrace() method should print the error information in a log file.
			 */
			//ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Error message : " + ex);
		} finally {
			System.out.println("Finally block is always executed.");
			scanner.close();
		}
		
	}

}
