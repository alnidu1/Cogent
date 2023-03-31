package Sorting;

import java.util.Comparator;

public class EmpNameComparator implements Comparator {
	
	@Override
	public int compare(Object ob1, Object ob2) {
		Emp o1=(Emp) ob1;
		Emp o2=(Emp) ob2;
		String s1=o1.name;
		String s2= o2.name;
		
		return s1.compareTo(s2);
		
	}

}
