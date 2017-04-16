package com.practice.keywordthis;

import com.practice.oops.Employee;

public class SuperClass extends Employee {


    public SuperClass(){
    	
    }
	
	
	public SuperClass(int i) {
		super(10);
		//System.out.println("print this value::"+ empId);
	}
	
	public static void main(String[] args){
		SuperClass sc =new SuperClass(empId );
		
	}
	
}
