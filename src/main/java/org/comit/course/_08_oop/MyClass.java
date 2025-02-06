package org.comit.course._08_oop;

public class MyClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		/*
		 * We should not access other object's attributes directly.
		 * need to Encapsulation via getters and setters
		 */
//		emp1.id = 1010;
//		emp1.name = "John";
//		emp1.salary = 80_000;
//		emp1.position = "Software Engineer";
		
		emp1.display();
		double bonus = emp1.getBonus(10);
		System.out.println("The bonus is "+bonus);
		
		System.out.println("*****************");
		
		Employee emp2 = new Employee();
		emp2.setId(1020);
		emp2.setName("Tim");
		emp2.setSalary(100_000);
		emp2.setPosition("Manager");
		
		emp2.display();
		bonus = emp2.getBonus(8);
		System.out.println("The bonus is "+bonus);
		
		System.out.println("*****************");
		
		Employee emp3 = new Employee(1030, "Mike", 95_000, "Accountant");
		emp3.display();
		bonus = emp3.getBonus(7);
		System.out.println("The bonus is "+bonus);
		
		System.out.println("*****************");
		
		Employee emp4 = new Employee(1040, "Lily");
		emp4.setSalary(50_000);
		emp4.setPosition("Assistant");
		emp4.display();
		
		bonus = emp4.getBonus(9);
		System.out.println("The bonus is "+bonus);
	}

}
