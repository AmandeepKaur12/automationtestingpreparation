package com.Java.Laerning.BasicJava;

public class Student{
	
	int age;
	int roll_no;
	
	public void display() {
		System.out.println("Welcome to all of out");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Deepak  = new Student();
		Deepak.age=18;
		Deepak.roll_no = 34;
		
		System.out.println("Age is :" + " "  + Deepak.age);
		System.out.println("Roll Number is :" + " " + Deepak.roll_no);
		
		Deepak.display();

	}

}
