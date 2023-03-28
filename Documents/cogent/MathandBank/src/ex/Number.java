package ex;

public class Number {
	int first;
	int second;
	double result=-1;
	
	public Number(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	void add() {
		int a=this.first;
		int b=this.second;

		this.result=a+b;
		System.out.println("add:" + this.result);

		
	}
	
	void sub() {
		int a=this.first;
		int b=this.second;
		
		this.result=a-b;
		System.out.println("sub:" + this.result);

		
	}
	
	void mul() {
		int a=this.first;
		int b=this.second;
		
		this.result=a*b;
		System.out.println("mul:" + this.result);

	}
	
	void div() {
		int a=this.first;
		int b=this.second;
		
		try {
			this.result=a/b;
			System.out.println("div:" + this.result);

		}
		
		catch(ArithmeticException e) {
			System.out.println("Second number cannot be 0");
		}
		
	}

}
