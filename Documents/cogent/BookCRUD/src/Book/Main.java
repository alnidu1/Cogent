package Book;

import java.util.Scanner;



public class Main {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Book books[]=null;
		BookDAO bdao= new BookDAO();
	
	
		int choice=0;
	
		do {
			System.out.println("========MENU=========");
			System.out.println("1.Add books\n2.Print books\n3.Update\n4.Delete\n5.Exit\n\n Please Enter Menu Option");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("How many record being added");
					books=new Book[sc.nextInt()];
					for(int i=0;i< books.length;i++) {
						books[i]=bdao.create();
						System.out.println("Book "+ books[i].getName()+ " is added\n");
					}
					
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
				default:
					System.out.print("Enter valid option 1-5\n");

			}
		
			
		}while(choice!=5);
	}

}
