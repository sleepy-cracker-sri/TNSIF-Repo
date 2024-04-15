package org.tnsif;

public class DecisionMakingWithOperators {
	public static void main(String[] args) {
		int x=10;  int y=20;
		int a=12;  int b= 78;
		
		if(x>=y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(!(a<b)||(a==b)){
			System.out.println("Condition is True");
		}
		else {
			System.out.println("condition is False");
		}
	}

}
