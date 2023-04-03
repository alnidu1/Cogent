package primeThread;

public class MyThread extends Thread {

	
	private int start;
	private int end;
	
	public MyThread(int start, int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	private boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
}
