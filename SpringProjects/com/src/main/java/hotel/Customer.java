package hotel;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;
	Reservation r;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Reservation getR() {
		return r;
	}
	@Autowired
	public void setR(Reservation r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", r=" + r + "]";
	}
	
	
}
