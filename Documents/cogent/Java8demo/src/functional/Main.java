package functional;

public class Main {

	public static void main(String [] args) {
		
		//MyClass mc= new MyClass();
		//int x= mc.sum(100, 200);
		
		//System.out.println(x);
		
		MyInterface mi=(a,b)-> (a+b);
		int result =mi.sum(10,20);
		
		System.out.println(result);
	}
}
