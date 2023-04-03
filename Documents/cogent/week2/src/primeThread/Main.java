package primeThread;

public class Main {

	public static void main(String[] args) {
		
		MyThread t1= new MyThread(1,10);
		
		t1.start();
		
	}
}
