package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("studentobject")
@Data
public class Student {

	public void study() {
        
		System.out.println("Student is reading book");
	}
}
