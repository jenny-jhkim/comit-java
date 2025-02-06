package org.comit.practice._03_practice;

public class Ex03 {

	public static void main(String[] args) {
		int year = 2000;
		boolean isLeapYear;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0 ) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = false;
			}
		} else {
			isLeapYear = false;
		}
		
		if(isLeapYear) {
			System.out.println("Year " + year + " is a leap year");
		} else {
			System.out.println("Year " + year + " is not a leap year");
		}


	}

}
