package oBJECTclass;

public class CONVERTINGstringINTOintger {

	public static void main(String[] args) {
		String s = "123";
		
		int i =Integer.parseInt(s);
		System.out.println(i);
		System.out.println(s+1);
		System.out.println(i+1);

	
		double d = Double.parseDouble(s);
		System.out.println(d+1.2);
		
		long l = Long.parseLong(s);
		System.out.println(l);
		
		
		String s1="10.01f";
		float f=Float.parseFloat(s1);
		System.out.println(f);		
		
		
		String s2="true";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b);		  
		
		byte b1 = Byte.parseByte(s);
		System.out.println(b1);

		String s3 = "12321";
		short sh = Short.parseShort(s3);
		System.out.println(sh);
		
		
		


	}

}
