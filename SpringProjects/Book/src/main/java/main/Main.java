package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.Book.dao.BookDAO;
import com.Book.daoimpl.BookDAOImpl;
import com.Book.dto.Book;


public class Main {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		BookDAO bdao= new BookDAOImpl();
		
	
		int choice=0;
	
		do {
			Book book= new Book();
			System.out.println("========MENU=========");
			System.out.println("1.Add books\n2.Print books\n3.Update\n4.Delete\n5.Read All\n6.Exit\n\n Please Enter Menu Option");
			try {
				choice=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Invalid type");
				sc.nextLine();
			}
			switch(choice) {
				case 1:
					
					bdao.create(book);
					break;
				case 2:
					bdao.read(0);
					break;
				case 3:
					bdao.update(0,book);
					break;
				case 4:
					bdao.delete(0);
					break;
				case 5:
					bdao.readAll();
					break;
				case 6:
					System.out.println("EXIT");
					break;

				default:
					System.out.print("Enter valid option 1-6\n");

			}
		
			
		}while(choice!=6);
	}
}
