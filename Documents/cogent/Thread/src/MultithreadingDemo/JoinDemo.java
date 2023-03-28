package MultithreadingDemo;

import java.util.Scanner;

public class JoinDemo extends Thread{

	static int n, sum=0;
	
	public static void main(String[] args) {
		long start= System.currentTimeMillis();
		System.out.println("Sum of 'N' number: ");
		System.out.println("Enter value");
		Scanner sc= new Scanner(System.in);
		JoinDemo.n=sc.nextInt();
		
		JoinDemo jd=new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of first "+ JoinDemo.n+ " numbers is "+ JoinDemo.sum);
		long end=System.currentTimeMillis();
		
		System.out.println("Time taken :"+(end-start)/1000+" Seconds");
	}
	
	@Override
	public void run() {
		for(int i=1;i<=JoinDemo.n;i++) {
			JoinDemo.sum+=i;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
