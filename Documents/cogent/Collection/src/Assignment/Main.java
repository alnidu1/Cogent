package Assignment;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Student stud= new Student();
		Scanner sc= new Scanner(System.in);
		
		stud.setNames();
		stud.printNames();
		
		System.out.println("Index to search");
		int temp=sc.nextInt();
		stud.searchName(temp);
		
		System.out.println("Name to search");
		String name=sc.next();
		stud.searchName(name);
		
		System.out.println("Name to remove");
		name=sc.next();
		stud.removeName(name);
		
		System.out.println("\n");
		stud.printNames();
	}
	
	

}
