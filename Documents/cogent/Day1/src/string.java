import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		if(args.length>0) {
			for(int i=0;i<args.length;i++) {
				String n=args[i];
				int l= n.length();
				String s= n.toUpperCase() ;
				String r= "";
				for(int j=l-1; j>= 0;j--) {
					r= r+n.charAt(j);
				}
				boolean a= false;
				//System.out.println(r+" "+n);

				if(r.equals(n)) {
					a=true;
					
				}
				
				System.out.println("Length:"+l+" Uppercase: " + s+ " Palindrome: " + a+"\n");
			}
		}
	}
			
		
		
		
		
}

