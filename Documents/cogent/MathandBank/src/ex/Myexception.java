package ex;

public class Myexception extends Exception{
	String str1;
	public Myexception(String s) {
	
		str1=s;
	
	}
	
	

	public String toString() {
		return("Exception occurred: " +str1);
	}

}
