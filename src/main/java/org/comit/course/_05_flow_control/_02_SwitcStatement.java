package org.comit.course._05_flow_control;

public class _02_SwitcStatement {
	public static void main(String[] args) {
		int day =1;
		switch (day) {
		    case 1:
		        System.out.println("Monday");
		        break;
		    case 2:
		        System.out.println("Tuesday");
		        break;
		    case 3:
		        System.out.println("Wednesday");
		        break;
		    case 4:
		        System.out.println("Thursday");
		        break;
		    case 5:
		        System.out.println("Friday");
		        break;
		    case 6, 7:
		        System.out.println("Weekend");
		    	break;
		    default:
		        System.out.println("Invalid input");
		}
		
		//The Simplified Switch statement - Java 14
		//can remove break if use -> instead of :
		switch (day) {
	    case 1 -> {
	        		System.out.println("Monday");
	        		System.out.println("Week start");
	    		}
	    case 2 -> 
	        System.out.println("Tuesday");
	    case 3 ->
	        System.out.println("Wednesday");
	    case 4 ->
	        System.out.println("Thursday");
	    case 5 ->
	        System.out.println("Friday");
	    case 6, 7 ->
	        System.out.println("Weekend");
	    default ->
	        System.out.println("Invalid input");
		}
		
		//The Simplified Switch statement with return - Java 14
		String str = switch (day) {
	    case 1 -> {
	    	String str2= "Hello ";
	    	yield str2 + "Monday" ;
	    }
	    case 2 -> "Tuesday";
	    case 3 -> "Wednesday";
	    case 4 -> "Thursday";
	    case 5 -> "Friday";
	    case 6, 7 -> "Weekend";
	    default -> "Invalid input";
		};
		
		System.out.println("return str: " + str);

	}

}
