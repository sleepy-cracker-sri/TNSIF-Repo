package org.tnsif;

public class TypeCastDemo {
	public static void main(String[] args) {
		byte b =10;
		int i =b;
		System.out.println(i);
		
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		char ch ='A';
		int i3 =ch;
		System.out.println(i3);
		
		char var1  ='\u00A7';
		int i4= var1;
		System.out.println(i4);
		
		double f1 =10.52f;
		long L =(long)f1;
		System.out.println(L);
		
		long L1 =923372036854775806L;
		int i2 =(int)L1;
		System.out.println(i2);
		
		float f2 =32.56f;
		int i1= (int)f2;
		System.out.println(i1);
		
		byte b1=90;
		char ch1=(char)b1;
		System.out.println(ch1);
		
		
		
	}

}
