package MultithreadingDemo;
/*
class MyThread  implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			
			System.out.println("i:"+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}*/

class MyThread extends Thread{
	MyThread(){
		super("Demo Thread");
		System.out.println("The child thread:"+this);
		start();
	}
	@Override
	public void run() {
		for(int i=5;i>0;i--) {
			
			System.out.println("child:"+i+"\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Exiting Child");

	}
	
}
public class Main {

	public static void main(String[] args) {
		
		/*MyThread mt=new MyThread();
		Thread th= new Thread(mt);
		th.start();
		
		for(int j=0;j<=10;j++) {
			System.out.println("j:"+j+"\t");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}*/
		
		new MyThread();
		for(int i=5;i>0;i--) {
			
			System.out.println("Main:"+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Exiting Main");
		
	}
	

}
