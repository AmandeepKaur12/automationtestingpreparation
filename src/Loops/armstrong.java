package Loops;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		System.out.println("Enter first armstrong number");
		Scanner scan = new Scanner(System.in);
	    int narmstrong = scan.nextInt();
	    
	    
	    int c=0,areminder,temp;  
	    
	    temp=narmstrong;  
	    
	    while(narmstrong>0) {
	    	areminder = narmstrong%10;
	    	narmstrong = narmstrong/10;
	    	c = c+(areminder*areminder*areminder);
	    }
	    	if(temp==c)  
	    	    System.out.println("armstrong number");   
	    	    else  
	    	        System.out.println("Not armstrong number");   
	    	   }
	    
	    

	}
