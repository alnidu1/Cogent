package day2;

import java.util.Scanner;

public class main {
	
	public static void main(String args[]) {
		Book books[]=new Book[2];
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<books.length;i++) {
			Book book=new Book();
			books[i]=book;
			System.out.println("Please enter book No");
			books[i].setBookNo(sc.nextInt());
			System.out.println("Please enter book name");
			books[i].setBookName(sc.next());
			System.out.println("Please enter book price");
			books[i].setPrice(sc.nextInt());
			System.out.println("Please enter book author");
			books[i].setAuthor(sc.next());
		
		
		}
		sc.close();
		System.out.println("\n");
		for(int i=0;i<books.length;i++) {
			System.out.println("BookNo:" +books[i].getBookNo());
			System.out.println("BookName:" +books[i].getBookName());
			System.out.println("Price:" +books[i].getPrice());
			System.out.println("Author:" +books[i].getAuthor()+"\n");
		}
		
	}

}
