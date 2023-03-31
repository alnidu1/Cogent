package StudentComparable;

public class Student{// implements Comparable {

	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name)  {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString()
	{
		return this.rollNo+" "+ this.name;
		
	}
	/*
	@Override
	public int compareTo(Object o){
		String s1=this.name;
		Student s2= (Student) o;
		
		
		return s1.compareTo(s2.name);
		
	}
	*/
}
