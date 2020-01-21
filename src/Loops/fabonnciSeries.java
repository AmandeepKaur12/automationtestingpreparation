package Loops;

import java.util.Scanner;

public class fabonnciSeries {

	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	  int fnum =0;
	  int fnum1 =1;
	  System.out.println("First " + a + " terms: " );
	  for(int i =1;i<= a; ++i) {
		  System.out.print(fnum + " + ");
		  int Sum = fnum+fnum1;
		  fnum = fnum1;
		  fnum1 =Sum;
		  
	  }
	    	
	    }

	}


