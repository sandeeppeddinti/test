package com.sandeep.datatypes;


public class TestConstructor {
	static int variable=8;
	
	static {
		System.out.println("This is static block.....");
	}
         
	
	public TestConstructor() {
		
		System.out.println("**********This is constructor***************");
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException{
		 TestConstructor obj=new TestConstructor();
		 TestConstructor obj1=new TestConstructor();
		 TestConstructor obj2=new TestConstructor();
		 TestConstructor obj3=new TestConstructor();
		 TestConstructor obj4=new TestConstructor();
		
		 
	
	}
	
	
}
