package com.springcore.ref;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = Logger.getLogger(Application.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		Person p = (Person) context.getBean("person");
		
		
		logger.info("*****Person Info*****");
		
		logger.info(p);

	}

}
