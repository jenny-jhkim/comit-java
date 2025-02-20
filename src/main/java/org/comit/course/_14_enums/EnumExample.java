package org.comit.course._14_enums;

enum Size {
	SMALL, MEDIUM, LARGE
}

enum DetailSize {
	SMALL(30), MEDIUM(50), LARGE(70);
	
	private int value;
	
	DetailSize(int value){
		this.value = value;
	}
	
	int getValue( ) {
		return this.value;
	}
}
public class EnumExample {

	static final int SMALL = 1;
	static final int MEDIUM = 2;
	static final int LARGE = 3;
	
	public static void main(String[] args) {
		int size = SMALL;
		size = MEDIUM;
		size = LARGE;
		size = 10000; // possible
		
		Size mySize = Size.MEDIUM;
		mySize = Size.LARGE;
		mySize = Size.SMALL;
		//mySize = 1000; // ERROR
		
		DetailSize s = DetailSize.LARGE;
		System.out.printf("Size: %s, Value: %d%n" ,s, s.getValue());
	}

}
