package CRUD;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Person person[]=null;
		PersonDAO pdao= new PersonDAO();
	
	
		int choice=0;
	
		do {
			System.out.println("========MENU=========");
			System.out.println("1.Add books\n2.Print books\n3.Update\n4.Exit\n\n Please Enter Menu Option");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print(1);
					break;
				case 2:
					System.out.print(2);
					break;
				case 3:
					System.out.print(3);
					break;
				case 4:
					System.out.print(4);
					break;
				default:
					System.out.print("Enter valid option 1-4\n");

			}
		
			
		}while(choice!=4);
	}
}
