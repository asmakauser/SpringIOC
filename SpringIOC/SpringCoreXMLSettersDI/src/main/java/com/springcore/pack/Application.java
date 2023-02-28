package com.springcore.pack;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ASMA KAUSER
 *
 */
public class Application {
	
	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(Application.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		System.out.println("Hello World!");
		Student student = (Student) context.getBean("student1");
		
		//context.getBean("student1",Student.class);
		logger.info(student);
		logger.info("***************************************");
		
	}

}
