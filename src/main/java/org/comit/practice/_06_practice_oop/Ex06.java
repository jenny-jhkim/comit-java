package org.comit.practice._06_practice_oop;

import java.util.concurrent.TimeUnit;

class TrafficLight{
	String colour;
	int duration;
	
	/**
	 * @param colour
	 * @param duration
	 */
	TrafficLight(String colour, int duration) {
		super();
		this.colour = colour;
		this.duration = duration;
	}
			
	String getColour() {
		return colour;
	}

	int getDuration() {
		return duration;
	}

	void changeColour() {
		if("red".equals(this.colour)) {
			this.colour = "green";
		}
		else if ("green".equals(this.colour)) {
			this.colour = "red";
		}
	}	
}

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 6.	Write a Java program to create a class 
		 * called "TrafficLight" with attributes for colour and duration, 
		 * a parameterized constructor and methods to change the colour and check for red or green. 
		 * The method that changes the colour automatically changes from red to green and vice versa.
		 */
		
		//Create the new object
		TrafficLight t = new TrafficLight("red", 1);
		
		try {
			//Print current colour and wait 1 second
			System.out.println(t.getColour());
			TimeUnit.SECONDS.sleep(t.getDuration());
			
			//Change the colour
			t.changeColour();
		
			//Print current colour and wait 1 second
			System.out.println(t.getColour());
			TimeUnit.SECONDS.sleep(t.getDuration());
			
			//Change the colour
			t.changeColour();
			
			//Print current colour and wait 1 second
			System.out.println(t.getColour());
			TimeUnit.SECONDS.sleep(t.getDuration());
			
			//Change the colour
			t.changeColour();
			
			//Print current colour
			System.out.println(t.getColour());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
