package pkg.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
	
	Person p= (Person) context.getBean(Person.class);
	
	System.out.println(p.getId()+" " + p.getName()+" "+ p.getAge());
	
	Product pr= (Product) context.getBean(Product.class);
	
	System.out.println(pr.getId()+" " + pr.getName()+" "+ pr.getPrice());

	}
}
