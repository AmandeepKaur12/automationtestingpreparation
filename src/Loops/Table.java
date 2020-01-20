package Loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

			System.out.println("Enter first number");
			Scanner scan = new Scanner(System.in);
		    int a = scan.nextInt();
		    
		    for(int i=1;i<=10;i++) {
		    	for(int j =i;j<=i;j++) {
		    	
		      		int m = a*j;
		    		System.out.println(+a + "*" +j + "="  + m);
	       	}
		    }

	}

}
