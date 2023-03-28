package week2;

import java.util.Scanner;

public class exceptionDemo {
	
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int x=sc.nextInt();
		System.out.println("Enter y");

		int y=sc.nextInt();
		
		try {
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
			
		}
		*/
		
		try {
			String input=args[0];
			System.out.println("Input: "+input);
			int output=Integer.parseInt(input);
			System.out.println(output);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("this is finally");
		}
		
		System.out.println("after try ctach block");
	}

}
