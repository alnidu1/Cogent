package Assignment;

public class ThreadDemo {

	public static void main(String[] args) {
		/*
		MyThread mt1= new MyThread();
		mt1.setName("First");
		mt1.setPriority(10);
		mt1.start();
		
		MyThread mt2= new MyThread();
		mt2.setName("Second");
		mt2.start();
		mt2.setPriority(1);
		System.out.println("Hi");
		*/
		
		
		MyThread mt1= new MyThread();
		mt1.setPriority(10);
		mt1.run();
		
		
		MyThread mt2= new MyThread();
		mt2.run();
		System.out.println("Hi");
		
	}
}
