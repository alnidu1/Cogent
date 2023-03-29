package Day8;

public class DisplayMessage {

	public synchronized void display(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+ name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
