package com.Java.Laerning.BasicJava;

import java.util.Scanner;

public class AssignementScaamerPart2 {

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
	
	//((((x1-x2)*x3)-x4)+x5)/x6
	public static void main(String[] args) {
    AssignementScaamerPart2 ASP2 = new AssignementScaamerPart2();
    Scanner scan1= new Scanner(System.in);
    System.out.println("Value of x1 is ");
    int X1 = scan1.nextInt();
    System.out.println("Value of x2 is ");
    int X2 = scan1.nextInt();
    System.out.println("Value of x3 is ");
    int X3 = scan1.nextInt();
    System.out.println("Value of x4 is ");
    int X4 = scan1.nextInt();
    System.out.println("Value of x5 is ");
    int X5 = scan1.nextInt();
    System.out.println("Value of x6 is ");
    int X6 = scan1.nextInt();
    scan1.close();
    
    int subresult1= ASP2.sub(X1, X2);
	//int addresult2 = ASC.add(subresult1, X4);
	int mulresult1 = ASP2.Mul(subresult1, X3);
	int subresult2= ASP2.sub(mulresult1, X4);
	int addresult1 = ASP2.add(subresult1,X5);
	ASP2.div(addresult1, X6);
    

	}

}
