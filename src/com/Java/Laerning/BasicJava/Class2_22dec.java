package com.Java.Laerning.BasicJava;

public class Class2_22dec {

	
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
		System.out.println("result of equation (((10-2)+2)*2)-2)/2 is " + c);
			
	}
	// (((10+2)-2)+2)*2)/2
	// (((10-2)+2)*2)-2)/2
	
	public static void main(String[] args) {

		Class2_22dec c222dec = new Class2_22dec();
		int addresult = c222dec.add(10, 2);
		int subresult = c222dec.Sub(addresult,2);
		int addresult1 = c222dec.add(subresult,2);
		int mulresult = c222dec.multiply(addresult1,2);
		c222dec.Divide(mulresult, 2);
		
		
	}

}
