package poly;

import java.util.Random;

public class Main {
public static void main(String args[]) { 
		/*
		Car c= new Car();
		c.drive(10, 10);
		c.display();
		
		SportCar c1=new SportCar();
		c1.drive(20, 10);

		c1.setAirBallonType("Red");
		c1.display();
		*/
		

	Random rand = new Random();
	/*
	 Medicine m[]= new Medicine[10];
	 Medicine med= new Medicine();
	 
	 med.setName("Name");
	 med.setAddress("Address");
	 med.displayLabel();
	 for(int i=0; i< m.length;i++) {
		 int randnum=rand.nextInt((3-1)+1)+1;
		 
		 if(randnum==1) {
			 m[i]=new Tablet();
		 }
		 
		 if(randnum==2) {
			 m[i]=new Syrup();
		 }
		 if(randnum==3) {
			 m[i]=new Ointment();
		 }
		 
		 m[i].displayLabel();
		 
	 }
	 */
	/*
	abstract_instrument instr[]= new abstract_instrument[10];
	for(int i=0; i< instr.length;i++) {
		 int randnum=rand.nextInt((3-1)+1)+1;
		 
		 if(randnum==1) {
			 instr[i]=new Piano();
		 }
		 
		 if(randnum==2) {
			 instr[i]=new Flute();
		 }
		 if(randnum==3) {
			 instr[i]=new Guitar();
		 }
		 
		 if(instr[i] instanceof Guitar) {
			 System.out.println("Type Guitar");
			 
		 }
		 
		 if(instr[i] instanceof Piano) {
			 System.out.println("Type Piano");
			 
		 }
		 
		 if(instr[i] instanceof Flute) {
			 System.out.println("Type Piano");
			 
		 }
		 instr[i].play();
		 
	 }
	 
	*/
	Compartment c[]= new Compartment[10];
	for(int i=0; i< c.length;i++) {
		 int randnum=rand.nextInt((4))+1;
		 
		 if(randnum==1) {
			 c[i]=new FirstClass();
		 }
		 
		 if(randnum==2) {
			 c[i]=new Ladies();
		 }
		 if(randnum==3) {
			 c[i]=new General();
		 }
		 if(randnum==4) {
			 c[i]=new Luggage();
		 }
		
			 
		 
		 c[i].notice();
		 
	 }
	
	
	
	 
	 
	}
}
