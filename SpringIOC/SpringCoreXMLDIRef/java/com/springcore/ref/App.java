package com.springcore.ref;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(App.class);

		 ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		A obj= (A) context.getBean("aref");
		logger.info("*********Printing Class A Variables**************");
		logger.info(obj.getX());
		
		
		logger.info("*****Printing Class B Variables*****");

		logger.info(obj.getOb().getY());

		obj.getOb().getY();
		
		
		logger.info(obj);
	}

}
