package org.comit.practice._03_practice;

public class Ex09 {

	public static void main(String[] args) {
		int count = 30;
		int number = 0;
		
		while(count>0) {
			if(number%2 == 0) {
				System.out.println(number);
				count--;
			}

			number++;
		}
		
		//second way
		 for (int i=0; i<30; i++)
		 {
		 	System.out.println(i*2);
		 }

	}

}
