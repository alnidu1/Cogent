package Assignment2new;

public class Storage {

	int item;
	boolean valueSet = false;

	

	synchronized void store(int item) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.item = item;
		valueSet = true;
		System.out.println("Storing: " + item);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
	}
	synchronized int print()

	{
		
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
			
		System.out.println("Printing:" + item);
		valueSet = false;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
		return item;
	}
}
