package student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Student {

	private HashMap<String,String> empName= new HashMap<>();
	
	public void setNames() {
		this.empName.put("5", "a");
		this.empName.put("4", "b");
		this.empName.put("3", "c");
		this.empName.put("2", "d");
		this.empName.put("1", "a");

		
		
	}
	
	public void printNames() {
		Collection<String> names=this.empName.values();
		System.out.println("Print all name: "+names);
	}
	
	public void getName(String key) {
		System.out.println(this.empName.get(key));
	}
	
	public void KeySetName() {
		Set<String> keyset= this.empName.keySet();
		
		for(String key: keyset) {
			System.out.println("key: " + key+ " value: "+ this.empName.get(key) );
		}
	}
	public void psize() {
		System.out.println("Size is "+ this.empName.size());
	}
	
	public void remove(String key) {
		this.empName.remove(key);
	}
}
