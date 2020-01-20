package com.Java.Laerning.BasicJava;

public class AssignementSuperKeywordParentClassPart2 {
	
	//variable 
	int  parentvariable = 56;
	
	//method
	public void parentmethod() {
		System.out.println(parentvariable);
		System.out.println("Calling parent method");
	}
	
	AssignementSuperKeywordParentClassPart2(){	
		this(4,5,4);
		System.out.println("Parent Default Constructor");
	}
	
	AssignementSuperKeywordParentClassPart2(int a){	
		this(2,3);
		System.out.println("Parent One Parameterized Constructor");
	}
	
	AssignementSuperKeywordParentClassPart2(int a, int b){
		this();
		System.out.println("Parent Two Parameterized Constructor");
	}
	
	AssignementSuperKeywordParentClassPart2(int a, int b , int c){
		System.out.println("Parent Three Parameterized Constructor");
	}
	
	
}
