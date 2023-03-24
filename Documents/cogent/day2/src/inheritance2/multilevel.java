package inheritance2;


class Grandfather{
	int grandfatherAge;

	public int getGrandfatherAge() {
		return grandfatherAge;
	}

	public void setGrandfatherAge(int grandfatherAge) {
		this.grandfatherAge = grandfatherAge;
	}
	
	public void showGrandfatherAge() {
		System.out.print("Grandfther age: "+ grandfatherAge);
	}
}

class Father extends Grandfather{
	int FatherAge;

	public Father(int fatherAge) {
		super(grandfatherAge+30);
		this.FatherAge = fatherAge;
	}

	public int getFatherAge() {
		return FatherAge;
	}

	public void setFatherAge(int fatherAge) {
		FatherAge = fatherAge;
	}
	public void showFatherAge() {
		showGrandfatherAge();
		System.out.print("Father age: "+ FatherAge);
	}
}	
class Son extends Father{
	int SonAge;

	public Son(int fatherAge, int sonAge) {
		super(fatherAge+30);
		this.SonAge = sonAge;
	}
	public void showSonAge() {
		showFatherAge();
		System.out.print("Son age: "+ SonAge);
	}
}
	

public class multilevel {
	
	

}
