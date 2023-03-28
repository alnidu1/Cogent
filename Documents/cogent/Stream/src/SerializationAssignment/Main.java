package SerializationAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Myexception {
		int c = 0;
		int rn;
		Scanner sc = new Scanner(System.in);
		FileInputStream fin = null;
		try {
			File f = new File("/Users/alnidu/Documents/Stream/asdf.ser");
			FileOutputStream fout = new FileOutputStream(f, true);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			
			fin = new FileInputStream(f);
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			
			do {
				System.out.println("Option:\n 1.Add\n 2.View\n 3.Exist");
				c = sc.nextInt();

				switch (c) {
				case 1:
					System.out.println("Enter Roll Number:");

					rn = sc.nextInt();

					System.out.println("Enter Namer:");
					String name = sc.next();
					System.out.println("Enter Age:");
					int age = sc.nextInt();
					System.out.println("Enter Address:");
					String address = sc.next();
					OClass o = new OClass(rn, name, age, address);
					System.out.println("Write to file?Y or N");
					String ans = sc.next();
					if (ans.equals("Y")) {
						try {

							oout.writeObject(o);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					break;
				case 2:
					try {
						
						boolean b = true;

						while (b) {

							Object obj = oin.readObject();
							if (obj != null) {
								OClass oc = (OClass) obj;

								System.out.println("Id:" + oc.rnum);
								System.out.println("Name:" + oc.name);
								System.out.println("Age:" + oc.age);
								System.out.println("Address:" + oc.Address);
							} else {
								b = false;
							}

						}
						// fin.close();
						// oin.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception ee) {
						ee.printStackTrace();
					}
					break;

				case 3:
					break;
				default:
					break;

				}

			} while (c != 3);

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
