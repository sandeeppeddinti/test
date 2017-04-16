package com.sandeep.datatypes;


public class Variables {
	
	public int number =9;
	
	
	public static int classVariable =5;
	
	public void add(int x, int y){
		int a =x;
		int b=y;
		int c= a+b;
		System.out.println("sum of two int inumbers::"+c);
	}
	


public static void main(String[] args) {
	
	System.out.println("************This is main method***************");
	
	
	
	Variables obj1 = new Variables();
	obj1.classVariable=2;
	
	Variables obj2 = new Variables();
	obj2.number = 4;
	System.out.println("instance variable values is ::"+obj1.number);
	System.out.println("instance two variable values is ::"+obj2.number);
	//static
	System.out.println("static or class  variable values is ::"+obj1.classVariable);
	System.out.println("static or class  variable values is ::"+obj2.classVariable);
	
	obj2.add(4,2);
	
	System.out.println("method parameters ::"+args[0]);
	
		
	}
	
}
