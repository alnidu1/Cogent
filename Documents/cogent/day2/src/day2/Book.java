package day2;

public class Book {
	int BookNo;
	String BookName;
	int price;
	String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNo, String bookName, int price, String author) {
		super();
		BookNo = bookNo;
		BookName = bookName;
		this.price = price;
		this.author = author;
	}
	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
