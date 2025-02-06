package org.comit.practice._03_practice;

public class Ex11 {
	/* 11.	Write a program in Java that prints 200 times the word "Hello."  
	 * Note: in your source code, you must only enter the word "Hello." */
	
	public static void main(String[] args) {
		int i = 1;
		
		while (i<=200) {
			System.out.printf("%3d Hello%n", i);
			i++;
		}

	}
}
