package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component("ob")
public class Customer {
	
	@Value("Sunita")
	private String name;
	
	@Value("Mangalore")
	private String city;

}
