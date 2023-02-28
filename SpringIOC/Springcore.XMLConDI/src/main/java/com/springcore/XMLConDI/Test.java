package com.springcore.XMLConDI;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Logger logger = Logger.getLogger(Test.class);
	ApplicationContext context = new ClassPathXmlApplicationContext("consconfig.xml");
	logger.info("*********Constructor Based DI**************");
	Person p= (Person) context.getBean("person");
    logger.info(p);
    
	}

}
