package com.practice.nonaccessmodifiers;

public  class Parent {
	static  String name="TITLE";

	public Parent() {

	}

	public  Parent(String inputName) {
//		name = "xyz";
	}

	public  void displayName(final String someLocalVar) {
		String newVar = someLocalVar;
		newVar ="some";
		
		final int someNumber=8;
		System.out.println(name);
		System.out.println(someNumber);
	}
	
//	public abstract void someAbstractMethod();

}
