package StudentComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassDemo {

	public static void main(String [] args) {
		List<Student> slist= new ArrayList<Student>();
		
		slist.add(new Student(5,"a"));
		slist.add(new Student(4,"k"));
		slist.add(new Student(3,"w"));
		slist.add(new Student(2,"z"));
		slist.add(new Student(1,"f"));

		
		System.out.println(slist);
		slist.sort( new StudentComparator());
		System.out.println(slist);

		
	}
}
