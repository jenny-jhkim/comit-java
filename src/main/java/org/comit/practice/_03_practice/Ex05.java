package org.comit.practice._03_practice;

public class Ex05 {

	public static void main(String[] args) {
		/*5.	Write a Java program for the following scenario: 
		 * A student will not be allowed to sit in an exam if his attendance is less than 75%. 
		 * Given the number of classes held and the number of classes attended, 
		 * print out the percentage of classes attended and 
		 * whether the student is allowed to sit in the exam or not.*/
		  int classesHeld = 9;
		  int classesAttented = 6;
		  
		  double attendance = (double) classesAttented / classesHeld * 100;
		  
		  System.out.printf("The percentage of classes attended is : %.2f%% %n", attendance);
		  
		  if (attendance >=75 ) {
			  System.out.printf("The student is allowed to sit in the exam.");
		  } else {
			  System.out.printf("The student is not allowed to sit in the exam.");
		  }


	}

}
