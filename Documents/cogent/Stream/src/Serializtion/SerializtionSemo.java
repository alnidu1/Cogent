package Serializtion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializtionSemo {
	public static void main(String[] args) {
		FileOutputStream fout;
		ObjectOutputStream oout;
		File f=new File("demo.ser");

		try {
			fout= new FileOutputStream(f);
			oout= new ObjectOutputStream(fout);
			
			Employee emp= new Employee(1, "Andy", 1000, 1223);
			oout.writeObject(emp);
			System.out.println("Serialized");
			
			oout.close();
			fout.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
