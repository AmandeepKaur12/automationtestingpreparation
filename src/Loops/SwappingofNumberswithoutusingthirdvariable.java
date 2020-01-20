package Loops;

import java.util.Scanner;

public class SwappingofNumberswithoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    
	    System.out.println("Enter second number");
	    int b = scan.nextInt();
	    
	    System.out.println("Before swapping - a: "+ a +", b: " + b);
	    
	    a =a+b; //60+90 = 150
	    b=a-b; //150-90 =60
	    a=a-b; //150 -60 =90
	    System.out.println("After swapping - a: "+ a +", b: " + b);
	}

}
