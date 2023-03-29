package Assignment2;



public class Main {

public static void main(String[] args) throws InterruptedException {
		
		
		Storage s=new Storage();
		Counter c= new Counter(s);
		Printer p= new Printer(s);
		
		synchronized(c) {
			
			c.start();
			p.start();
			
			p.wait();
		}
		//c.start();
		//p.start();
		
	}
}