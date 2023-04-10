package hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("classpath:hotel/config.xml");
		Customer person=(Customer) context.getBean("customer");
		
		Reservation res=person.getR();
		
		System.out.println(person);
	}

}
