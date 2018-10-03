package org.cubic.SampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Customer c = (Customer) context.getBean("customer");
		System.out.println(c.toString());

	}
}
