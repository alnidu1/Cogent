package Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HelloWorld.Employee;
import com.HelloWorld.Greeting;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		  Hospital p=(Hospital) context.getBean("hospital");
		  
		  
		 // System.out.println(" Name "+ p.getName()+ "List: "+ p.getDepartment());
		  //System.out.println(p.getDepartment().getClass());
		  
		  Trainer t= (Trainer) context.getBean("pokedex");
		  
		  //System.out.println("id: "+ t.getId()+ " pokedex entry "+ t.getPoke());
		  
		  CarDealer cd= (CarDealer) context.getBean("cardealer");
		  //System.out.println(cd.getName()+ " "+ cd.getModel());
		  
		  Student stud= (Student) context.getBean("student");
		  System.out.println(stud);
	}
}
