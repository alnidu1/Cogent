package inheritance;

public class Main {
	public static void main(String[] args) {
		Book bk= new Book();
		bk.setTitle("hamlet");
		bk.setAuthor("Shake");
		bk.setPrice(10.99);
		
		Magazine mag= new Magazine();
		mag.setIssue("23 Feb 1990");
		mag.setTitle("Time");
		mag.setPrice(2.99);
		
		mag.sell(10);
		bk.sell(10);
	}

}
