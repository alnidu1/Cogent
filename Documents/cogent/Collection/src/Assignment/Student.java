package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {

	private ArrayList<String> names=new ArrayList<String>();
	
	public void setNames() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many names?");
		int c=sc.nextInt();
		
		for(int i=0; i< c;i++) {
			System.out.println((i+1)+". Enter name:");
			String name=sc.next();
			this.names.add(name);
		}
	}
	
	public void searchName(String name) {
		int i=0;
		for(String temp: this.names) {
			
			if(temp.equals(name)) {
				System.out.println("Name found at " + i);
				
			}
			i++;
		}
		
		
	}
	
	public void searchName(int i) {
		if(i < this.names.size()) {
			System.out.println("Name at "+ i + " is "+ this.names.get(i) );
		}
		
		else {
			System.out.println( i + " is larger than array size" );
		}
	}
	
	public void printNames() {
		System.out.println("Printing name");

		for(String s: this.names) {
			System.out.println(s);
			}
		
	}
	
	public void removeName(String name) {
		
		
		Iterator it= this.names.iterator();
		
		while(it.hasNext()) {
			if(it.next().equals(name)) {
				System.out.println(name+ " reomved");
				it.remove();
				return;
			}
		}
		
		System.out.println("No name in list");
		
	}
}
