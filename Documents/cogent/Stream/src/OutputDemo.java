import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputDemo {

	public static void main(String[] arg) {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		File f=new File("/Users/alnidu/Documents/Stream/emp.txt");
		File outfile=new File("/Users/alnidu/Documents/Stream/newemp.txt");

		try {
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
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
