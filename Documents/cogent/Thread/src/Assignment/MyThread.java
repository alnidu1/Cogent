package Assignment;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread name:"+ this+ " i: "+i);
		}
	}

	
	
}

/*
public class MyThread implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread name:"+ this+ " i: "+i);
		}
	}
}
*/