package Assignment2new;


public class Counter extends Thread{

	Storage s;
	Counter(Storage s){
		this.s=s;
		new Thread(this, "Counter").start();
	}
	public void run() {
		int i = 0;
		while(true) {
			s.store(i++);
		}
	}
}
