package org.tnsif;

public class PrimitiveDataTypesDemo {
	public static void main(String[] args) {
		byte byteMax =127;
		byte byteMin =127;
		System.out.println("min range of byte is  :"+byteMin+ "\nMax range of byte is "+byteMax);
	
		short shortMax =32767;
		short shortMin =-32768;
		System.out.println("min range of short is  :"+shortMin+ "\nMax range of short is "+shortMax);
		
		int maxInt =2147483647;
		int minInt =-2147483648;
		System.out.println("min range of Int is :"+minInt+"\nmax range of Int is : "+maxInt);
		
		long maxLong = 9223372036854775807l;
		long minLong = -9223372036854775808l;
		System.out.println("min range of Long is :"+minLong+"\nmax range of Long is : "+maxLong);
		
		float f=3234.141245678902345f;
		double d =3234.141245678902345678814f;
		System.out.println("Float value is :"+f+"\nDouble Vale  is : "+d);
		
		boolean flag=false;
				System.out.println("Bloolean value is :"+flag);
	}

}
