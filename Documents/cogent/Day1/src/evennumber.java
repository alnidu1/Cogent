import java.util.Scanner;

public class evennumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Value");
		int n=sc.nextInt();
		
		int i=0;
		while(i< n) {
			System.out.println(i);
			i=i+2;
			
		}
	}
}
