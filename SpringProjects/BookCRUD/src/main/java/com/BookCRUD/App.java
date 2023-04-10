package com.BookCRUD;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.BookCRUD.dao.BookDao;
import com.BookCRUD.daoimp.BookDaoImpl;
import com.BookCRUD.dto.Book;

public class App {
	
	
	
	public static void main(String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        BookDao bookDao = (BookDao) context.getBean(BookDaoImpl.class);

        Scanner sc= new Scanner(System.in);
        
        int choice=0;
    	
		do {
			Book book= new Book();
			System.out.println("========MENU=========");
			System.out.println("1.Add books\n2.Print book by ID\n3.Update\n4.Delete\n5.Read All\n6.Exit\n\n Please Enter Menu Option");
			try {
				choice=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Invalid type");
				sc.nextLine();
			}
			switch(choice) {
				case 1:
					try {
					System.out.println("Enter book details");
					System.out.println("Enter id:");
					int id= sc.nextInt();
					System.out.println("Enter name:");
					String name=sc.next();
					System.out.println("Enter Price");
					Double price=sc.nextDouble();
					
					book.setId(id);
					book.setName(name);
					book.setPrice(price);
					bookDao.saveBook(book);
					}catch(InputMismatchException e) {
						System.out.println("Invalid type");
						sc.nextLine();
					}
					break;
				case 2:
					try {
						System.out.println("Enter id");
						int id=sc.nextInt();
						System.out.println(bookDao.getBookById(id));
					}
					catch(InputMismatchException e) {
						System.out.println("Invalid type");
						sc.nextLine();
					}
					break;
				case 3:
					try {
						System.out.println("Enter id");
						int id1=sc.nextInt();
						book.setId(id1);
						System.out.println("Enter name");
						String name2=sc.next();
						book.setName(name2);
						System.out.println("Enter price");
						Double price1=sc.nextDouble();
						book.setPrice(price1);
						bookDao.updateBook(book);
					}
					catch(InputMismatchException e) {
						System.out.println("Invalid type");
						sc.nextLine();
					}
					break;
				case 4:
					try {
						System.out.println("Enter id");
						int id2=sc.nextInt();
						book.setId(id2);
						bookDao.deleteBook(id2);
					}catch(InputMismatchException e) {
						System.out.println("Invalid type");
						sc.nextLine();
					}
					break;
				case 5:
					System.out.println(bookDao.getAllBooks());
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
