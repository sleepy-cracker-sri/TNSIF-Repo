package org.tnsif;

public class SwitchDemo {
	public static void main(String[] args) {
		char x='l';
		switch(x) {
		case 'L':
		case 'l':
		System.out.println(x+" : is Letter");	
			break;
		
		case 'd':
		case 'D':
			System.out.println(x+" : is Digit");
			break;
		
		case 'w':
		case 'W':
			System.out.println(x+" : is WhiteSpace");
			break;
		
		case 's':
		case 'S':
			System.out.println(x+" : is SpecialSymbol");
			break;
		
		default:
			System.out.println(x+" : is Other than Letter, digit, WhiteSpace or SpecialSymbol");
			break;
		}
		
	}

}
