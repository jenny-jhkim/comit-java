package org.comit.course._05_flow_control;

public class _04_WhileLoopStatement {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
		    System.out.println("Iteration: " + i);
		    i++;
		}
		
		i = 1;
		do {
			System.out.println("Iteration: " + i);
			i++;
		} while (i <= 5);

	}
}
