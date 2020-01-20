package Loops;

import java.util.Scanner;

public class SwappingofNumbersusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    
	    System.out.println("Enter second number");
	    int b = scan.nextInt();
	    
	    System.out.println("Before swapping - a: "+ a +", b: " + b);
	    
	    int temp;
	    temp =a;
	    a=b;
	    b= temp;
	    System.out.println("After swapping - a: "+ a +", b: " + b);
	}

}
