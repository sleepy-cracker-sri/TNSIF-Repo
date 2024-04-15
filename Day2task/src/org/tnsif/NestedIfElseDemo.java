package org.tnsif;

public class NestedIfElseDemo {
	public static void main(String[] args) {
		System.out.println("biggest among all numbers");
		
		int a,b,c;
		a=98;
		b=41;
		c=81;
		
		if (a>b){
			if (a>c) {
				System.out.println("biggest among all the num is a : "+a);
			}
			else {
				System.out.println("biggest among all the num is c : "+c);
					
				}
			}
		else {
			if (b>c) {
				System.out.println("biggest among all the num is b :" +b);
			}
			else {
			System.out.println("biggest among all the num is c :"+c);
			}
		}
	}

}
