package org.comit.practice._03_practice;

public class Ex04 {

	public static void main(String[] args) {
		//4.	Write a Java program for the following scenario: 
		//A company decides to give a bonus of 5% to the employees 
		//if their years of service are more than 5 years. 
		//So, given a number of years of service and a salary, print out the bonus.
		
		int years = 8;
		double salary = 65000;
		double bonus = (years>5) ? salary*0.05 : 0;
		
		System.out.println("Your years of service is " + years + " years. So your bonus is " + bonus);
		


	}

}
