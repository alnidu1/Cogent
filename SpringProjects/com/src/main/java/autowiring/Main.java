package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("classpath:autowiring/config.xml");
		Person person=(Person) context.getBean("person");
		
		Car car=person.getCar();
		
		System.out.println(car);
	}

}
