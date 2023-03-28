import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDemo {
	
	public static void main(String[] args) {
		
		FileInputStream in=null;
		try {
			//File f=new File("/Users/alnidu/Documents/Stream/abc.txt");
			File f=new File("/Users/alnidu/Documents/Stream/emp.txt");
			in= new FileInputStream(f);
			int ch;
			while((ch=in.read())!=-1) {
				System.out.print((char) ch);
				
			}
			
			in.close();
		} 
		catch(FileNotFoundException f) {
			f.printStackTrace();
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
