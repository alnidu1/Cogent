package pkg.pkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Person config() {
		Person p= new Person();
		p.setId(1301);
		p.setName("Ash");
		p.setAge(10);
		
		return p;
		
	}
	
	@Bean
	public Product Productconfig() {
		Product p= new Product();
		p.setId(1);
		p.setName("Phone");
		p.setPrice(1000);
		
		return p;
		
	}
}
