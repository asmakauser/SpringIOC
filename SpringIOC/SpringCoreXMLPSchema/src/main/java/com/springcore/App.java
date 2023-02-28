package com.springcore;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.App;

/**
 * @author ASMA KAUSER
 *
 */
public class App {
	
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(App.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		System.out.println("Hello World!");
		Student student1 = (Student) context.getBean("student1");
		Student student2 =  (Student) context.getBean("student2");
		
		
		logger.info(student1);
		logger.info("***************************************");
		logger.info(student2);
		

	}

}
