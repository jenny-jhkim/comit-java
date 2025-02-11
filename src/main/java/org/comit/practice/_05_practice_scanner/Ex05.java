package org.comit.practice._05_practice_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* 5.	Write a Java program that generates a random number from 1 to 20, giving the user three chances to guess the number.  
		 * Display a message indicating if the user guessed the number. 
		 * Hint: You can use the Math library to generate the random number.
		 * 
		 */
		
		//Math.random() return 0.0 ~ 1.0
		int randomNum = (int) (Math.random() * 20) + 1;
		int guessCounter = 3;
		
		try {

			System.out.println("You have three changes to guess a number (1-20)");
			Scanner scanner = new Scanner(System.in);
			int guess = 0;
			
			
			do {
				System.out.println("Enter your guess: ");
	
				guess = scanner.nextInt();
				
				if(guess == randomNum) {
					System.out.println("Congrate!! You found the number!! ");
					break;
				} else {
					System.out.printf("Oh, You have %d more chance left%n" , --guessCounter );
					scanner.nextLine();
				}
			} while(guessCounter > 0);

			System.out.printf("%nGAME OVER. The number was %d%n", randomNum);
			
			scanner.close();
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid input format. Please enter a valid input");
		}


	}

}
