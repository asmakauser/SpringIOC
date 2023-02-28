package com.springcore.javaconfig;

import lombok.ToString;


@ToString
public class Person {
	
	private Books books;

	
	public Person(Books books) {
		super();
		this.books = books;
	}

	public void study()
	{
		
		this.books.display();
		System.out.println("Person is reading book");

	}

}
