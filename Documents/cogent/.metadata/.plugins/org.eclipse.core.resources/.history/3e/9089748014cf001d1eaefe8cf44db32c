package TestTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	TreeSet<String> product= new TreeSet<String>();
	
	public void add() {
		TreeSet<String> p=this.product;
		
		p.add("laptop");
		p.add("laptop");
		p.add("phone");
		p.add("glasses");
		p.add("camera");
		p.add("bottle");
	}
	
	public void print() {
		TreeSet<String> p=this.product;
		Iterator it= p.iterator();
		
		while(it.hasNext()) {
			System.out.println("Product:"+it.next());
		}
	}
	public void firstlast() {
		
		TreeSet<String> p=this.product;
		Iterator it= p.iterator();
		
		if(it.hasNext()) {
			System.out.println("First Product:"+it.next());

		}
		String temp="";
		while(it.hasNext()) {
			temp=(String) it.next();
		}
		System.out.println("Last Product:"+temp);
	}
	
	public void size() {
		
		
		System.out.println("Size:"+this.product.size());
		
	}
	
	public void remove(String s) {
		
		this.product.remove(s);
	}
	
}
