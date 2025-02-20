package org.comit.course._13_static;

class Employee {

	   // Shared by all employees
	   static int companyCode = 1001; 
	   String name;

	   Employee(String name) {
	      this.name = name;
	   }

	   void show() {
	      System.out.println(name + " works at company code: " + companyCode);
	   }
}

public class _01_StaticVariableExample {

	public static void main(String[] args) {
	      Employee e1 = new Employee("Alice");
	      Employee e2 = new Employee("Bob");

	      e1.show();
	      e2.show();

	      // Changing static variable affects all instances
	      Employee.companyCode = 2002;
	      e1.show();
	      e2.show();
	      
	      e1.companyCode = 3003;
	      e1.show();
	      e2.show();


	}

}
