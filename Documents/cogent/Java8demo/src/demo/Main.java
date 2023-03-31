package demo;

interface MyInterface
{
	void m1();
	void m2();
	void m3();
	default void m4() {
		System.out.println("m4");

	}
}

class A implements MyInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("A m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("A m2");

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("A m3");

	}
	
}

class B implements MyInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("B m1");

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("B m2");

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("C m3");

	}
	
}
public class Main {

	
	public static void main(String[] args) {
		MyInterface ma= new A();
		MyInterface mb= new B();

		ma.m4();
		ma.m1();
		mb.m1();
	}
}
