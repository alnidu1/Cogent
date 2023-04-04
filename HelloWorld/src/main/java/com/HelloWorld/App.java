package com.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {

  
	  //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

	  Greeting g=(Greeting) context.getBean("hello");
	  String m=g.greeting();
	  System.out.println(m);
	  
	  Employee emp= (Employee) context.getBean("emp"); 
	  
	  System.out.println("ID "+emp.getId()+" Name "+ emp.getName());
  }
}
