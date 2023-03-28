package week2;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		int i=0;
		Integer ii= Integer.valueOf(i);
		int iii= ii.intValue();
		
		System.out.println("int:" + i+" integer:"+ii+" int:"+iii);
		
		long l=1;
		Long ll =Long.valueOf(l);
		long lll= ll.longValue();
		
		char c='a';
		Character cc= Character.valueOf(c);
		char ccc=  cc.charValue();
		
		byte b=8;
		Byte bb= Byte.valueOf(b);
		byte bbb= bb.byteValue();
		
		short s=100;
		Short ss= Short.valueOf(s);
		short sss= ss.shortValue();
		
		float f=100.00f;
		Float ff= Float.valueOf(f);
		float fff= ff.floatValue();
		
		double d= 100.00;
		Double dd= Double.valueOf(d);
		double ddd= dd.doubleValue();
		
		boolean bool=true;
		Boolean bbool= Boolean.valueOf(bool);
		boolean bbbool= bbool.booleanValue();
		
		
		
		
		
	}

}
