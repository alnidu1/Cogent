package com.HelloWorld.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/HelloWorld/lc/config1.xml");

		  Patient p=(Patient) context.getBean("patient");
		  
		  System.out.println(p);
		  context.registerShutdownHook();
		  
	}

}
