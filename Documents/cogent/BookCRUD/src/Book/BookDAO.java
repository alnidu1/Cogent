package Book;

import java.util.Scanner;


public class BookDAO {
	
	Scanner sc=new Scanner(System.in);
	public Book create() {
		Book b= new Book();
		
		System.out.println("Please enter book id");
		b.setID(sc.nextInt());
		System.out.println("Please enter book name");
		b.setName(sc.next());
		System.out.println("Please enter price");
		b.setPrice(sc.nextInt());
		
		
		return b;
		
	}
	
	public void read(Book books[] ) {
		System.out.println("\n");
		for(Book book:books) {
			if(book==null) {
				continue;
			}
			System.out.println("BookID:" + book.getID()+ 
					" Book Name:" + book.getName()+ " Book Price:" + book.getPrice());
		}
		System.out.println("\n");

		
		
	}
	
	public void update(Book books[]) {
		System.out.println("Enter bookID you wish to update");
		int uid= sc.nextInt();
		
		for(Book book: books) {
			if(uid==book.getID()) {
				String oldname= book.getName();
				int price= book.getPrice();
				System.out.println("Book: " + book.getName() + " with a price of " + book.getPrice());
				System.out.println("Please new book name");
				book.setName(sc.next());
				System.out.println("Please enther new price");
				book.setPrice(sc.nextInt());
				
				System.out.println("\n"+oldname + " "+ price+" "+ " -> 4" + book.getName()+ " "+ book.getPrice()+ "\n");	
			}
		
		}
		
		
		
	}
	
	public void delete(Book books[]) {
		
		read(books);
		
		System.out.println("Please enter bookid you wish to delete");
		int uid=sc.nextInt();
		
		for(int i=0;i< books.length;i++) {
			if(uid==books[i].getID()) {
				System.out.println("Delete this book?(Y/N)\n");
				System.out.println("Name:" + books[i].getName() + " " +books[i].getPrice());
				String yn= sc.next();
				if(yn.equals("Y")) {
					books[i]=null;
					
				}
				else {
					System.out.println("Returning to menu");
				}
			}
			
			
		}
	}

}
