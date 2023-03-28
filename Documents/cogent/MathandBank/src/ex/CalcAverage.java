package ex;

public class CalcAverage {
	
	public double avgFirst(int N) throws IllegalArgumentException{
		
		double sum=0;
		double avg=0;
		for(int i=1;i <N;i++) {
			sum=sum+i;
		}
		try{
			avg=sum/N;
		}catch(ArithmeticException e )
		{
			System.out.println("N cannot be zero");
			
		}
		catch(IllegalArgumentException f){
			System.out.println("N need to be natural");

		}
		return avg;
	}

	
	
}
