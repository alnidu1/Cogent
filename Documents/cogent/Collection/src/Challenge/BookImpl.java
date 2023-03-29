package Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class BookImpl implements BookDAO{

	Scanner sc=new Scanner(System.in);
		@Override
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
		@Override
		public void read(ArrayList<Book> books ) {
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
		@Override
		public void update(ArrayList<Book> books) {
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
		@Override
		public void delete(ArrayList<Book> books) {
			
			read(books);
			
			System.out.println("Please enter bookid you wish to delete");
			int uid=sc.nextInt();
			
			Book btemp=null;
			
			for(Book b: books) {
				if(b.getID()==uid) {
					btemp=b;
				}
				
			}
			if(btemp!=null) {
				books.remove(btemp);
			}
		}
		
		@Override
		public void find( ArrayList<Book> books) {
			System.out.println("Enter name of book to find");
			String name=sc.next();
			for(Book b: books) {
				if(b.getName().equals(name)) {
					System.out.println("Name:"+name+ " id: "+ b.getID()+ " Price: " + b.getPrice() );
				}
				
			}
		}
		
	
}
