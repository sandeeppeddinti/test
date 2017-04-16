package com.practice.oops.inheritance;

public class Superclass {
	protected int age;

//	public Superclass() {
//		// TODO Auto-generated constructor stub
//	}
	protected Superclass(int age) {
		this.age = age;
	}
	

	protected void getAge() {
		System.out.println("The value of the variable named age in super class is: " + age);
		
	}
}
