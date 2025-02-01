package org.comit.course._04_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String; // java.lang.* is imported automatically

public class Scan {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter your age: ");		
			int age = scanner.nextInt();
			scanner.nextLine(); //clear the buffer (previous <Enter>)
			
			System.out.println("Enter your name: ");		
			String name = scanner.nextLine();
			
			System.out.println("Your name is " + name + " and you are " + age + " years old.");
			
			scanner.close();
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid input");
			
		}


	}

}
