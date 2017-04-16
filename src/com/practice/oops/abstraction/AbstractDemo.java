package com.practice.oops.abstraction;

public class AbstractDemo extends Employee {

	public static void main(String[] args) {
		AbstractDemo abs= new AbstractDemo();
		Employee emp= abs;
//		emp.setName("sandeep");
//		emp.setNumber(102);
//		System.out.println(emp.getName());
//		System.out.println(emp.getNumber());
		
		emp.setName("sandeep....");
		emp.setNumber(10222);
	    System.out.println(emp.getName());
  		System.out.println(emp.getNumber());
		

	}

}
