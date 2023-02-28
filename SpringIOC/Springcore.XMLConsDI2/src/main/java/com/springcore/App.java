package com.springcore;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(App.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("calcconfig.xml");
		Calculate calc = (Calculate) context.getBean("calculate");
		logger.info("************F*************");
		logger.info(calc);
		calc.doSum();

	}
}
