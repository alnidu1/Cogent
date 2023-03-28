package ex;

public class Emp {
	int empId;
	String empName;
	String designation ;
	double basic;
	double hra=0;
	
	void printDEFT(){
		System.out.println("Name: " + this.empName);
		System.out.println("ID: " + this.empId);
		System.out.println("Destination: " + this.designation);
		System.out.println("Basic: " + this.basic);
		System.out.println("hra: " + this.hra);



		
	}
	
	void calculateHRA() {
		if(this.designation.equals("Manager")) {
			this.hra=.10*this.basic;
		}
		else if(this.designation.equals("Officer")) {
			this.hra=.12* this.basic;
		}
		
		else if(this.designation.equals("Clerk")) {
			this.hra=.05* this.basic;
		}
		else {
			this.hra=0;
		}
	}
	 Emp(String name, int id, String d, double basic) throws LowSalException{
		 if(basic<=500) {
				throw new LowSalException("Basic must be greater than 500");
		}
		 else {
			this.empName=name;
			this.empId=id;
			this.designation=d;
			this.basic=basic;
			calculateHRA();
		}
	 }


	
}