package com.springcore.coll;

import java.util.List;
import java.util.Map;

import lombok.ToString;

@ToString
public class Customer {

	private String name;
	private String[] books;
	private List<String> address;
	private Map<String, Integer> phones;

	public Customer(String name, String[] books, List<String> address, Map<String, Integer> phones) {
		super();
		this.name = name;
		this.books = books;
		this.address = address;
		this.phones = phones;

		System.out.println("Customer:" + "string, array,list,map");
	}

}
