package Assigment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IODemo {
	
	public static void main(String[] args){
		
		FileInputStream fin=null;
		FileOutputStream fout=null;
		File f= new File(args[0]);
		File outfile= new File(args[1]);
		
		try {
			
			if(outfile.exists()) {
				fin=new FileInputStream(f);
				fout= new FileOutputStream(outfile);
				System.out.println("File already existed, Overwrite?Y or N");
				Scanner sc = new Scanner(System.in);
				String ans= sc.next();
				if(ans.equals("Y")) {
					int data;
					
					while((data=fin.read())!=-1) {
						fout.write(data);
					}
					System.out.println("Data copied");
					fin.close();
					fout.close();
				}
			}
			else {
				fin=new FileInputStream(f);
				fout= new FileOutputStream(outfile);
				int data;
				
				while((data=fin.read())!=-1) {
					fout.write(data);
				}
				System.out.println("Data copied");
				fin.close();
				fout.close();
				
			}
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Source file not exists");
			
		}
		catch(IOException ee) {
			ee.printStackTrace();
		}
	}

}
