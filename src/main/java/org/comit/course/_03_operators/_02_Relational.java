package org.comit.course._03_operators;

public class _02_Relational {

	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		
		boolean isEqual = a==b;
		boolean isNotEqual = a!=b;
		boolean isGreaterThan = a>b;
		boolean isLessThan = a<b;
		boolean isGreaterOrEqual = a>=b;
		boolean isLessOrEqual = a<=b;
		
		System.out.println("Is equal: " + isEqual);
		System.out.println("Is not equal: " + isNotEqual);
		System.out.println("Is greater than: " + isGreaterThan);
		System.out.println("Is less than: " + isLessThan);
		System.out.println("Is greater or equal: " + isGreaterOrEqual);
		System.out.println("Is less or equal: " + isLessOrEqual);
		

	}

}
