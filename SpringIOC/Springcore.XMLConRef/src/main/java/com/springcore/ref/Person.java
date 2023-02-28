package com.springcore.ref;

import lombok.ToString;


public class Person {

	
	private String name;
	private int personId;
	private Course course;
	
	public Person(String name, int personId, Course course) {
		super();
		this.name = name;
		this.personId = personId;
		this.course=course;
		
		System.out.println("Person:"+ "String , int, ref");
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.personId+"{ "+this.course.name+" }";
	}

}
