package Loops;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		
		System.out.println("Enter number to find palidrome");
		Scanner scan = new Scanner(System.in);
	    int palindromenumber = scan.nextInt();
		   
        int reverseno = 0;
        int reminder;
        int comapareno =  palindromenumber;
        
        while(palindromenumber > 0) {
        	
        	reminder = palindromenumber%10;
        	palindromenumber = palindromenumber/10;
        	reverseno = reverseno*10 + reminder;
  	
        }
        if(comapareno == reverseno) {
        	System.out.println("Number is palindrome");    	
        }
        else {
			System.out.println("Number is not a palindrome");
		}
        
        
        
        
       
    }
 

	}

