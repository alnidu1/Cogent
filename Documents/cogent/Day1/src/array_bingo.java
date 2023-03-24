import java.util.ArrayList;

public class array_bingo {
	public static void main(String[] args) {
		if(args.length==2) {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			
			int bingo[]= {1,20,15,10,18};
			int bin[]=new int[5];
			String s="";
			int c1 = 0;
			int c2=0;
			for(int i=0;i<5;i++) {
				bin[i]=(int)(Math.random()*40);
				
				
				for(int j=0; j <i;j++ ) {
					if(bin[i]==bin[j]) {
						bin[j]=(int)(Math.random()*40);
					}
					if(bin[j]==0) {
						bin[j]=(int)(Math.random()*40);

					}
				}
			}
			
			for(int i:bin) {
				s=s+" "+i;
				if(i==num1) {
					c1=1;
				}
				else if(i==num2) {
					c2=1;
				}
				else {
					continue;
				}
			}
			
			if(c1==1 && c2==1) {
				System.out.println("Bingo!" +num1 + " and " + num2 +" is in Array[" +s+"]" );
			}
			else if(c1==1 || c2==1){
				System.out.println("Only one match in array [" +s + "] num1:" + num1+ " num2: " +num2);
			}
			else {
				System.out.println("num1: " +num1+ " num2 "+num2+" not in array [" + s+"]");

			}
		}
			
		
		
		else {
			System.out.println("Invalid args" );
		}
	}
}
