package autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	Car car;

	
	
	public Person(Car car) {
		super();
		this.car = car;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
