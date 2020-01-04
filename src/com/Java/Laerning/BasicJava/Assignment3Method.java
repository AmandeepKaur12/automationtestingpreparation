package com.Java.Laerning.BasicJava;

public class Assignment3Method {
	
	public void Assignment3Method() {
		
		System.out.println("Default Method");
	}

	
public void Assignment3Method(int A) {
	
	System.out.println("1 parameterized Method");
		
	}

public void Assignment3Method(int A, int B) {
	this.Assignment3Method(4,5,5);
	this.Assignment3Method();
	this.Assignment3Method(3);
	this.Assignment3Method(1,2,3,4);
	System.out.println("2 parameterized Method");
	
}

public void Assignment3Method(int A, int B , int C) {
	
	System.out.println("3 parameterized Method");
	
}

public void Assignment3Method(int A, int B , int C,int D) {
	
	System.out.println("4 parameterized Method");
	
}

	public static void main(String[] args) {

		Assignment3Method obj1 = new Assignment3Method();
		obj1.Assignment3Method(2, 3);
	}

}
