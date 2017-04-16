package com.nonaccessmodifiers;

public class DoubleClass {
	public String name = "sandeep";

	public static void main(String[] args) {
		DoubleClass dc = new DoubleClass();
		ClassDouble cd = new ClassDouble();
		System.out.println(dc.name);
		 System.out.println(dc.name + cd.lname);
	     System.out.println(cd.lname);
		
	}
}

class ClassDouble {
	String lname = "peddinti";



 //    System.out.println(dc.name + cd.lname);
 //    System.out.println(cd.lname);
	
}