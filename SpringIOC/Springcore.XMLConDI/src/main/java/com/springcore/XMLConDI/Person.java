/**
 * 
 */
package com.springcore.XMLConDI;

import lombok.ToString;

/**
 * @author ASMA KAUSER
 *
 */

@ToString
public class Person {

	private String name;
	private int personId;

	public Person(String name, int personId) {
		super();
		this.name = name;
		this.personId = personId;
		
		System.out.println("Constructor:  String, Int");
	}

}
