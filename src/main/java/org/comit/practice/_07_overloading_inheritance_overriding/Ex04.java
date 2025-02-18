package org.comit.practice._07_overloading_inheritance_overriding;

/* 4.	Write a Java program to create a base class Sport with a method called play(). 
 * Create three subclasses: Football, Basketball, and Rugby. 
 * 
 * Override the play() method in each subclass to display a specific statement for each sport.
 * 
 */
class Sport {
	void play() {
		System.out.println("Let's play sports");
	}
}

class Football extends Sport {

	@Override
	void play() {
		System.out.println("Kick the ball to the goal");
	}
}

class Basketball extends Sport {

	@Override
	void play() {
		System.out.println("Shoot the ball into the hoop");
	}
}

class Rugby extends Sport {

	@Override
	void play() {
		System.out.println("Carry the ball over the opponent's goal line");
	}
}
public class Ex04 {

	public static void main(String[] args) {
		Sport sport = new Sport();
		sport.play();
		
		Sport football = new Football();
		football.play();
		
		Sport basketball = new Basketball();
		basketball.play();
		
		Sport rugby = new Rugby();
		rugby.play();

	}

}
