package Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Main {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Book> books=new ArrayList<Book>();

		BookDAO bdao= new BookImpl();
	
	
		int choice=0;
	
		do {
			System.out.println("========MENU=========");
			System.out.println("1.Add books\n2.Print books\n3.Update\n4.Delete\n5.Find\n6.Exit\n\n Please Enter Menu Option");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter book detail");
					
					books.add(bdao.create());					
					
					break;
				case 2:
					bdao.read(books);
					break;
				case 3:
					bdao.update(books);
					break;
				case 4:
					bdao.delete(books);
					break;
				case 5:
					bdao.find( books);
				default:
					System.out.print("Enter valid option 1-5\n");

			}
		
			
		}while(choice!=6);
	}

}
