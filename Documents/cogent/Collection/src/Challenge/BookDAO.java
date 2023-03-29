package Challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public interface BookDAO {
	
	public Book create();
	
	public void read(ArrayList<Book> books ) ;
	
	public void update(ArrayList<Book> books);
	
	public void delete(ArrayList<Book> books);
	
	public void find(ArrayList<Book> books);
}
