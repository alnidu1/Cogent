package student;

public class Student {

	private int no;
	private String className;
	private String name;
	public Student(int no, String className, String name) {
		super();
		this.no = no;
		this.className = className;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
