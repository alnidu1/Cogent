package univers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");

		  Uni p=(Uni) context.getBean(Uni.class);
		  
		  System.out.println(p);
		  
	}
}
