package org.tnsif;

public class OperatorsDemo {
	public static void main(String[] args) {
		int a =1;
		int b= 2;
		int x=1;
		System.out.println("a and b value before the ooperation :"+a+" "+b);
		a++;
		
		
		int c = ++a + b + a--;
		System.out.println("C value after the operations : "+c);
		
		int d= c++ + a + b--;
		System.out.println("D value after the operation : "+d);
		
		System.out.println("A,B,C,D values after the operations"+a+" "+b+" "+c+" "+d);
		
		x=(10==x)?1:0;
		
		System.out.println(x);
		
	}

}
