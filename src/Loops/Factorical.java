package Loops;

import java.util.Scanner;

public class Factorical {

	public static void main(String[] args) {
		
        int f =1;
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    
	    for(int i=1; i<=a;i++) {
	    	//System.out.println("Value of i is" + i);
	    	f= f*i;
	    	}
	    
	    	System.out.println("Factorical of number is " + f);
	    
	}
		
		
		

}
