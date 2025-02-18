package org.comit.practice._07_overloading_inheritance_overriding;

/* 
 * 5.	Write a Java program to create a base class named BankAccount with methods called deposit() and withdraw(). 
 * Create a subclass called SavingsAccount 
 * that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 * 
 */

class BankAccount {
	double balance;
	
	void deposit(double amount) {
		System.out.println("Deposit: " + amount);
		this.balance = this.balance + amount;
		displayBalance();
	}
	
	void withdraw(double amount) {
		System.out.println("Withdraw: " + amount);
		this.balance = this.balance - amount;
		displayBalance();
	}
	
	void displayBalance() {
		System.out.println("Current balance: " + this.balance);
	}
}

class SavingsAccount extends BankAccount {

	SavingsAccount() { }
	
	SavingsAccount(double amount ){
		this.balance = amount;
	}
	
	@Override
	void withdraw(double amount) {

		if (this.balance - amount < 100 ) {
			System.out.println("Prevent withdrawals: the account balance will be below 100. ");
		} else {
			super.withdraw(amount);
		}
	}
	
}
public class Ex05 {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount(500);
		savings.displayBalance();
		savings.deposit(300);
		savings.withdraw(50);
		savings.withdraw(700);
	}

}
