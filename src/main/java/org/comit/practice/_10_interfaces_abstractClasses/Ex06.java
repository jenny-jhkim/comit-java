package org.comit.practice._10_interfaces_abstractClasses;

import java.time.DayOfWeek;

/*
 * 6.	Write a Java program to create an enum called "DaysOfWeek," representing the days of the week.
 */

enum DaysOfWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY			
}

public class Ex06 {

	public static void main(String[] args) {
		DayOfWeek day = DayOfWeek.WEDNESDAY;
		
		System.out.println(day);
	}

}
