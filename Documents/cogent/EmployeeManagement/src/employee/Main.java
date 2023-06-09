package employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		ArrayList<EmployeePojo> Employees=new ArrayList<EmployeePojo>();

		EmployeeDao empdao= new EmployeeDaoImpl();
	
	
		int choice=0;
	
		do {
			try {
				System.out.println("========MENU=========");
				System.out.println("1.Add Employees\n2.Print Employees\n3.Update\n4.Delete\n5.Find\n6.Sort\n7.Exit\n\n Please Enter Menu Option");
				choice=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input datatype, please enter an Integer ");
				sc.nextLine();
			}
			
			switch(choice) {
				case 1:
					System.out.println("Enter Employee details");
					EmployeePojo temp;
					temp=empdao.create();
					if(temp!=null) {
						Employees.add(temp);
					}
					break;
				case 2:
					empdao.printAll(Employees);
					break;
				case 3:
					empdao.update(Employees);
					break;
				case 4:
					empdao.delete(Employees);
					break;
				case 5:
					empdao.find( Employees);
					break;
				case 6:
					empdao.sort(Employees);
					break;
				case 7:
					break;
				default:
					System.out.print("Enter valid option 1-7\n");

			}
		
			
		}while(choice!=7);
	}

}


