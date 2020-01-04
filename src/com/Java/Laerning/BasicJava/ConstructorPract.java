package com.Java.Laerning.BasicJava;

public class ConstructorPract {
	
	
	int a,b,c,d,e;
	
	public ConstructorPract(){
		System.out.println("Default");
	}
	
	public ConstructorPract(int a){
		System.out.println("Default para");
	}

	public static void main(String[] args) {
		ConstructorPract obj1 = new ConstructorPract(2);
		obj1.a = 30;
		System.out.println(obj1.a = 30);

	}

}
