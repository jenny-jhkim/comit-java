package org.comit.practice._03_practice;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 48;
		int num2 = 12;
		int num3 = 37;
		
		int greatest = num1;// We assume "num1" is the greatest.
		
		if(num2 > greatest) {
			greatest = num2;
		} 
		if(num3 > greatest){
			greatest = num3;
		} 
		
		System.out.println("The greatest number is : " + greatest);

	}

}
