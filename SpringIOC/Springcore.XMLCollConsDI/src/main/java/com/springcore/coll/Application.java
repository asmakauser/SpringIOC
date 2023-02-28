package com.springcore.coll;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger("Application.class");
		ApplicationContext context = new ClassPathXmlApplicationContext("collconfig.xml");
		Customer cus = (Customer) context.getBean("cust");
		logger.info(cus);

	}
}
