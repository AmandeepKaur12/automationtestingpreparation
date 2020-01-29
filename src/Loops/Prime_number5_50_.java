package Loops;

import java.util.Scanner;

public class Prime_number5_50_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Count = 0;
		
	    	    
	        for(int i =5;i<=50;i++) {
	           		Count =0;
	           		for(int j =2;j<=i/2;j++) {
	        
	    	 if(i%j == 0) {
	    		// System.out.println("Not a prime number");
	    		 Count=1;
	    		 break;	    		 
	    	 }
	     }
	    	 if(Count == 0) {
				System.out.println( i + "Number is prime number");
			}
	    
	    }
	    
	}
}
