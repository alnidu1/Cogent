package week2;

public class GCdemo {
	int objint;
	
	GCdemo(int i){
		this.objint=i;
		System.out.println("Created:"+this.objint);

	}
	
	
	
	public static void main(String[] args ) {
		
		for(int i=1;i<100000;i++) {
			new GCdemo(i);
		}
		
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize:"+this.objint);
	}

}
