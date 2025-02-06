package org.comit.practice._03_practice;

public class Ex08 {

	public static void main(String[] args) {
		//8.	Write a program in Java that prints the first 20 prime numbers in the console.
		
		int count = 0;
		int number = 2;
		
		while (count <=20)
		{
			boolean prime = true;
			for (int i=2; i*i<number; i++) {
				if(number%i == 0)
				{
					prime = false;
					break;
				}
			}
			
			if(prime) {				
				System.out.printf("#%d: %d %n", count+1, number);
				count++;
			} 
			number++;
		}		

	}

}
