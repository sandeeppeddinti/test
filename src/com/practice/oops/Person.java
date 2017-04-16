package com.practice.oops;

public  abstract class Person {
	 String name;
	 int Age;
	 int Height;
	 int weight;
	 String EyeColor;
	 String Gender;
	
	public  String sendName(String inputName){
		 name = "Hi "+inputName;
		return name;
	}
	
	public abstract void displayEmpSal();

}
