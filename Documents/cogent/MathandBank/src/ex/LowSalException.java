package ex;

public class LowSalException extends Exception {
	String str1;
	
	public LowSalException(String s) {
	
		str1=s;
	
	}
	
	

	public String toString() {
		return("Exception occurred: " +str1);
	}

}
