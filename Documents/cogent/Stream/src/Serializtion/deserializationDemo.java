package Serializtion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserializationDemo {

	public static void main(String[] main) {
		FileInputStream fin;
		
		try {
			fin= new FileInputStream("");
			ObjectInputStream oin= new ObjectInputStream(fin);
			Object obj= oin.readObject();
			Employee emp= (Employee) obj;
			
			System.out.println("Id:"+emp.id);
			System.out.println("Name:"+emp.name);
			System.out.println("salary:"+emp.salary);
			System.out.println("ssn:"+emp.ssn);

			
			fin.close();
			oin.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
