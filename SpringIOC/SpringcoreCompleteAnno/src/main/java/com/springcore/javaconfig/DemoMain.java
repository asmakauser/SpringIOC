package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		/* Using @Component to configure bean */

		/*
		 * Student student = context.getBean("studentobject", Student.class);
		 * System.out.println(student); student.study();
		 */

		/* Using @Bean annotation to configure bean */

		Person person = context.getBean("temp1", Person.class);
		System.out.println(person);
		person.study();

	}

}
