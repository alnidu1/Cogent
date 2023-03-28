package SerializationAssignment;

import java.io.Serializable;

public class OClass implements Serializable {
	int rnum;
	String name;
	int age;
	String Address;
	public OClass(int rnum, String name, int age, String address) {
		super();
		this.rnum = rnum;
		this.name = name;
		this.age = age;
		Address = address;
	}
	

}
