package org.comit.practice._06_practice_oop;

class Book {
	String title;
	String author;
	String isbn;
	/**
	 * @param title
	 * @param author
	 * @param isbn
	 */
	Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	void display()
	{
		System.out.printf("Title: %s, Author: %s, ISBN: %s%n", title, author, isbn);
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		/* 
		 * 5.	Write a Java program to create 
		 * a class called "Book" with attributes for the title, author, and ISBN, a parameterized constructor 
		 * and a display() method that prints out the book information. 
		 * In another class, create an array of books, add three books, and print the books by looping the array over.
		 */
		
//		Book[] bookArray = new Book[3];
//		bookArray[0] = new Book("Harry Potter", "J.K.Rowling", "1234567890123");
//		bookArray[1] = new Book("Momo", "Michael Ende", "9876543210123");
//		bookArray[2] = new Book("Empire of the Ants", "Bernard Werber", "9783161484100");
		
		Book[] bookArray = {
			new Book("Harry Potter", "J.K.Rowling", "1234567890123"),
		 	new Book("Momo", "Michael Ende", "9876543210123"),
			new Book("Empire of the Ants", "Bernard Werber", "9783161484100"),
		};
		
		
		for(Book book: bookArray) {
			book.display();
		}
	}

}

