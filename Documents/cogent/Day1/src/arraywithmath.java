
public class arraywithmath {
	public static void main(String[] args) {
		int A[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum=0;
		int min=99;
		String s="";
		for(int i=0;i<14;i++ ) {
			s=s+" "+A[i];
			sum=sum+A[i];
			
			if(A[i]< min) {
				min=A[i];
			}
			
		}
		A[15]=sum;
		A[16]=sum/15;
		A[17]=min;
		s=s+" "+A[15]+" " +A[16]+" "+ A[17];
		
		System.out.println("["+s+" ]");

	}
	
}
