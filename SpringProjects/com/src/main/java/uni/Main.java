package uni;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:uni/config.xml");

		  University p=(University) context.getBean("university");
		  
		  System.out.println(p);
		  
		  System.out.println(p.hashCode());
		  University p1=(University) context.getBean("university");

		  System.out.println(p1.hashCode());

		  
	}
}
