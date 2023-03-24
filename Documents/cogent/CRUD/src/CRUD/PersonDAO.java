package CRUD;

import java.util.Scanner;

public class PersonDAO {
	
	Scanner sc=new Scanner(System.in);
	public void create(Person person[],int i) {
		Person p= new Person();
		person[i]=p;
		
		System.out.println("Enter id");
		person[i].setPersonID(sc.nextInt());
		System.out.println("Enter Name");
		person[i].setName(sc.next());
		System.out.println("Enter Address");
		person[i].setAddress(sc.next());
		

		
		
	}
	
	public void read( Person person[]) {
		
		for(Person p: person) {
			System.out.println("Person ID is: "+p.getPersonID() );
			System.out.println("Person Name is: "+ p.getName());
			System.out.println("Person Name is: "+ p.getAddress());

			
		}
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
