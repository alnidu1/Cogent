package com.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		  Prescription p=(Prescription) context.getBean("prescription");
		  
		  System.out.println(p);
		  
	}
}
