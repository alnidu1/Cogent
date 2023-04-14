package newMavenProject.com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
  public static void main(String[] args) {
	  AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:newMavenProject/com/NewFile.xml");

	  Employee p=(Employee) context.getBean("emp");
	  
	  System.out.println(p);
	  context.registerShutdownHook();
  }
}
