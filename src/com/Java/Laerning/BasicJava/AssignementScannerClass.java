package com.Java.Laerning.BasicJava;

import java.io.InputStream;
import java.util.Scanner;

public class AssignementScannerClass {
	
	
	public int add(int x1,int x2) {
		int addresult = x1+x2;
	    System.out.println("Result of addition is" + addresult);
		return addresult;
		
	}
	
	public int sub(int x3,int x4) {
		int subresult = x3-x4;
	    System.out.println("Result of subtraction is" + subresult);
		return subresult;
		
	}
	
	public void div(int x5,int x6) {
		int divresult = x5/x6;
	    System.out.println("Result of equation is" + divresult);
		}
	
	public int Mul(int x7,int x8) {
		int Mulresult = x7*x8;
	    System.out.println("Result of multiplication is" + Mulresult);
		return Mulresult;	
	}
//((((x1+x2)-x3)+x4)*x5)/x6
	
	public static void main(String[] args) {
		AssignementScannerClass ASC = new AssignementScannerClass();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Value one x1");
		int X1= scan1.nextInt();
		System.out.println("Value one x2");
		int X2 = scan1.nextInt();  
	    System.out.println("Value one x3");
		int X3= scan1.nextInt();
		System.out.println("Value one x4");
		int X4 = scan1.nextInt();
		System.out.println("Value one x5");
		int X5= scan1.nextInt();
		System.out.println("Value one x6");
		int X6 = scan1.nextInt();
	    scan1.close();	
		int addresult1 = ASC.add(X1, X2);
		int subresult1= ASC.sub(addresult1, X3);
		int addresult2 = ASC.add(subresult1, X4);
		int mulresult1 = ASC.Mul(addresult2, X5);
		ASC.div(mulresult1, X6);
		
	}

}
