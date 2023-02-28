package com.springcore;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = Logger.getLogger(Test.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("annoconfig.xml");

		Student student = context.getBean("student", Student.class);

		logger.info(student);

	}

}
