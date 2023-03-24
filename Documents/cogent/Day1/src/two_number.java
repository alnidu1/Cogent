import java.util.ArrayList;

public class two_number {
	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList<Integer>();
			for(int i=0;i<args.length;i++) {
				String n=args[i];
				int num= Integer.parseInt(n);
				
				//System.out.println(num);
				nums.add(num);
				
			}
			
		if(nums.size()==2) {		
		
			for(int i=0;i<13;i++) {
				int num= nums.get(i) + nums.get(i+1);
				nums.add(num);
			}
			System.out.println(nums);
			
			//without arraylist
			String s="";
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			s=s+" " + num1;
			s=s+" "+ num2;
					
			for(int i=0;i<13;i++) {
				int sum=num1+num2;
				s=s+" "+ sum;
				num1=num2;
				num2=sum;
			}
			System.out.println(s);

		}
		else {
			System.out.println("Invalid Args");
		}
	}
		
	
}
