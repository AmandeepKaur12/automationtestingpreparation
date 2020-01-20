package Loops;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    
	    if(a%2 != 0) {
	    	
	    	System.out.println("Number is Prime"+ a);	    	
	    }
	    
	    else {
	    	System.out.println("Number is not a prime number");
	    }
	    

	}

}
