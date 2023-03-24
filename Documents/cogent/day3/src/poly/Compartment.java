package poly;

public abstract class Compartment {
	abstract void notice();
}
 
class FirstClass extends Compartment{
	@Override
	void notice() {
		System.out.println("First class offboarding please");
	}
}

class Ladies extends Compartment{
	@Override
	void notice() {
		System.out.println("Ladies offboard please");
	}
}

class General extends Compartment{
	@Override
	void notice() {
		System.out.println("General offboarding please");
	}
}

class Luggage extends Compartment{
	@Override
	void notice() {
		System.out.println("Luggage offboarding please");
	}
}