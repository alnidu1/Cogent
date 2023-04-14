package emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:emp/config.xml");

		  Employee p=(Employee) context.getBean("emp");  
		  System.out.println(p.hashCode());
		  
		  
		  Employee p1=(Employee) context.getBean("emp");
		  System.out.println(p1.hashCode());
	  }
}
