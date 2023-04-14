package com.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeDAO;
import dto.Employee;


public class App {
  public static void main(String[] args) {

  
	  ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
	  EmployeDAO dao= (EmployeDAO) ctx.getBean("employdao");
	  
	  Employee emp= new Employee();
	  
  }
}
