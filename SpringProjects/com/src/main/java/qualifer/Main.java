package qualifer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("qualifer/config.xml");
		
		Employee emp= (Employee) ctx.getBean("employee");
		
		System.out.println(emp);
	}
}
