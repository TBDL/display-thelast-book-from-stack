package com.example.bookstack;

import java.util.*;
import java.lang.*;


public class BookstackApplication {

	public static void main(String[] args) {

		Book book1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
		Book book2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
		Book book3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
		Book book4 = new Book("A Journey Into the Earth" ,"Jules Verne", 1864);
		Book book5 = new Book("Cell", "Stephen King", 2006);

		ArrayDeque<Book> theBooks = new ArrayDeque<Book>();

		theBooks.push(book1);
		theBooks.push(book2);
		theBooks.push(book3);
		theBooks.push(book4);
		theBooks.push(book5);

		System.out.println("Queue is created. It's size: " + theBooks.size());

		for(Book x: theBooks){

			theBooks.pop();

			if (theBooks.size() == 1) {
				System.out.println("The last object taken from the queue was: " + theBooks.peek());
			}
		};

		System.out.println("Queue is created. It's size: " + theBooks.size());

	}
}
