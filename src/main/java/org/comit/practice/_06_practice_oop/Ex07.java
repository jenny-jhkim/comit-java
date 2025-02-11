package org.comit.practice._06_practice_oop;

class Employee {
	String name;
	String jobTitle;
	double salary;
	
	/**
	 * @param name
	 * @param jobTitle
	 * @param salary
	 */
	Employee(String name, String jobTitle, double salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getJobTitle() {
		return jobTitle;
	}

	void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("Employee Info [ name: %s, title: %s, salary: %s ]", name, jobTitle, salary);
	}
	
}

public class Ex07 {
	public static void main(String[] args) {
	/*
	 * 7.	Write a Java program to create a class
	 *  called "Employee" with a name, job title, salary attributes, 
	 *  a parameterised constructor and methods to retrieve and update the salary.
	 */
		
		Employee e = new Employee("Tiffany", "Manager", 90_000);
		System.out.println(e);
		
		e.setSalary(110_000);
		
		System.out.println(e);
	}
}
