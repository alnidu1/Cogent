package Sorting;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		Set<Emp> set=new TreeSet<>(new EmpNameComparator());
		
		set.add(new Emp(100,"d"));
		set.add(new Emp(200,"c"));

		set.add(new Emp(300,"b"));

		set.add(new Emp(400,"a"));

		for(Emp em:set) {
			System.out.println(em.id+" "+ em.name);
		}
	}

}

