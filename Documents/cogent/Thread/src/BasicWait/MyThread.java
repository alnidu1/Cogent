package BasicWait;

public class MyThread extends Thread{

	int total;
	
	@Override
	public void run() {
		System.out.println("Calculatiing the sum");
		synchronized(this) {
			for(int i=1;i<=100;i++) {
				total+=i;
			}
		
			this.notify();
		}
	}
}
