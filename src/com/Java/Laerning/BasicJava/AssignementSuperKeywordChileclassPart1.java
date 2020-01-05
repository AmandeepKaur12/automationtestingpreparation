package com.Java.Laerning.BasicJava;

public class AssignementSuperKeywordChileclassPart1 extends AssignementSuperKeywordParentClassPart2 {
	
	AssignementSuperKeywordChileclassPart1(){
		this(2,3);
		System.out.println("Child Default Constructor");
	}
	
	AssignementSuperKeywordChileclassPart1(int a){	
		this(1,2,3);
		System.out.println("Child One Parameterized Constructor");
	}
	
	AssignementSuperKeywordChileclassPart1(int a, int b){	
         super(2);
		System.out.println("Child Two Parameterized Constructor");
	}
	
	AssignementSuperKeywordChileclassPart1(int a, int b , int c){	
		this();
		System.out.println("Child Three Parameterized Constructor");
	}
	
public static void main(String[] args) {
		
	AssignementSuperKeywordChileclassPart1 ASKP1 = new AssignementSuperKeywordChileclassPart1(3);
		
	}

}
