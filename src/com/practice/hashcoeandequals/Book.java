package com.practice.hashcoeandequals;

public class Book {

	Book(String book) {

	}

	public static void main(String[] args) {
		Book firstBook = new Book("0201914670"); // Swing Tutorial, 2nd edition
		Book secondBook = new Book("0201914670");
		Book firstRef=firstBook;
		
		if(firstBook==firstRef)
		{
			System.out.println("this is true");
		}
		if(firstBook==secondBook){
			System.out.println("Objects are equal by ==");
		}
		if (firstBook.equals(secondBook)) {
			System.out.println("objects are equal");
		} else {
			System.out.println("objects are not equal");
		}
	}

}
