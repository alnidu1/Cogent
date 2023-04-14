package wiring;

public class Person {

	Car car;
	Address address;
	public Car getCar() {
		return car;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Car car, Address address) {
		super();
		this.car = car;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [car=" + car + ", address=" + address + "]";
	}
	
	
}
