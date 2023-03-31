package lambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {


	public static void main(String [] args) {
		
		
		
		/*
		MyInterface mi=(s) -> (s.length());
		int l= mi.length("asklks");
		
		System.out.println(l);
		*/
		
		List<String> names= Arrays.asList("a", "apple", "cmsa", "das", "esk");
		Predicate<String> p= (s)->s.startsWith("a");
		
		
		for(String st:names) {
		if(p.test(st))
		{
			System.out.println(st);
		}}
		
		
		Supplier<Double> randomV=()-> Math.random() *100;
		Double nums= randomV.get();
		System.out.println(nums);;
		
		Consumer<String> c=(x)->System.out.println(x.toLowerCase());
		c.accept("ANDY");
	}
}
