package Assignment2;

public class Printer extends Thread {

	Storage s;
	Counter c;

	public Printer(Storage s2) {
		// TODO Auto-generated constructor stub
		this.s=s2;
	}

	@Override
	public void run() {
		synchronized(this) {
			
		for (int i = 0; i <= 100; i++) {
			
			System.out.println("Printer class " + s.num);
			
		}
		notify();
		
		}
	}
}
