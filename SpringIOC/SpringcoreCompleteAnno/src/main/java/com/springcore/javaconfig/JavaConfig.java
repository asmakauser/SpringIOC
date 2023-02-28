package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Books getBooks() {
		
		return new Books();
	}
	
	
	
	@Bean(name = {"person","temp"})
	public Person getPerson() {

		Person p = new Person(getBooks());
		return p;
	}

}
