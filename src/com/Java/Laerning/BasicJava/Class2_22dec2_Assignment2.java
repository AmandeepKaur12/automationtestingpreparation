package com.Java.Laerning.BasicJava;

public class Class2_22dec2_Assignment2 {

	
	public int add(int a, int b) {
	    int c = a+b;
		return c;
	}
	
	public int Sub(int a, int b) {
	    int c = a-b;
		return c;
	}
	
	public int multiply(int a, int b) {
		int c = a*b;
		return c;
	}
	
	public void Divide(int a, int b) {
		int c = a/b;
		System.out.println("result of equation is (((10-2)+2)*2)-2)/2 " + c);
			
	}
	
	///(((10-2)+2)*2)-2)/2

	public static void main(String[] args) {
		Class2_22dec c2_22dec = new Class2_22dec();
		int subresult = c2_22dec.Sub(10, 2);
		int addresult = c2_22dec.add(subresult,2);
		int mulresult = c2_22dec.multiply(addresult, 2);
		int subresult1 = c2_22dec.Sub(mulresult,2);
		c2_22dec.Divide(subresult1, 2);	
	}

}
