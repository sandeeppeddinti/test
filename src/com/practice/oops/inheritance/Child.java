package com.practice.oops.inheritance;

public class Child extends Parent{
 int number=2;
	public Child(){
		super();
	}
	
	public void display()
	{
		Child child = new Child();
        System.out.println("super clall numbervalue is ::"+super.number);
        System.out.println("print------------>::"+child.number);
	}
	
	public static void main(String[] args){
		Parent parent =new Parent();
        Child child = new Child();
        child.display();
		
		
	}
	
}
