package Assignment2new;


public class Printer extends Thread{
	
	Storage s;
	Printer(Storage s){
		this.s = s;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		while(true) {
			s.print();
		}
	}
		
}
