package com.Java.Laerning.BasicJava;

public class Assignmnt3Constructors {
	
	public Assignmnt3Constructors() {
		this(3,4,5);
		System.out.println("Default Constructor");
	}

	
public Assignmnt3Constructors(int A) {
	this();
	System.out.println("1 parameterized Constructor");
		
	}

public Assignmnt3Constructors(int A, int B) {
	this(3,4,4,9);
	System.out.println("2 parameterized Constructor");
	
}

public Assignmnt3Constructors(int A, int B , int C) {
	
	System.out.println("3 parameterized Constructor");
	
}

public Assignmnt3Constructors(int A, int B , int C,int D) {
	this(0);
	System.out.println("4 parameterized Constructor");
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmnt3Constructors A2C = new Assignmnt3Constructors(4,3);
	}

}
