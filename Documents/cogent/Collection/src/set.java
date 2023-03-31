import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String [] args) {
		Random obj= new Random();
		Set<Integer> set= new TreeSet<Integer>();
		set.add(100);
		set.add(500);
		set.add(1);
		set.add(30);
		set.add(30);
		
		System.out.println(set);
		
		
		
	}
}
