package Loops;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Count = 0;
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int n = a/2;
	    
	        for(int i =2;i<=a;i++) {
	    	 if(a%2 == 0) {
	    		 System.out.println("Not a prime number");
	    		 Count=1;
	    		 break;	    		 
	    	 }
	     }
	    	 if(Count == 0) {
				System.out.println(a + "Number is prime number");
			}
	    
	    }
	    
	}

