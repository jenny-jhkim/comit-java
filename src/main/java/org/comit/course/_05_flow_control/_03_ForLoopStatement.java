package org.comit.course._05_flow_control;

public class _03_ForLoopStatement {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Iteration: " + i);
		}
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			if ( i == 3 ) {
				System.out.println("i is 3 ");
				continue;
			}
		    System.out.println("Iteration: " + i);
		}
		System.out.println();
		System.exit(0); //Exit program
		
		//enhanced for loop
		int[] numbers = {10, 20, 30, 40, 50};

		for (int number : numbers) {
		    System.out.println("Number: " + number);
		}


	}

}
