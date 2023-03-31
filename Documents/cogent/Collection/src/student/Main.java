package student;

public class Main {

	public static void main(String []args) {
		
		Student stud= new Student();
		
		stud.setNames();
		stud.printNames();
		stud.getName("1");
		stud.KeySetName();
		stud.psize();
		stud.remove("1");
		stud.printNames();
	}
}
