package com.practice.oops.inheritance.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Rectangle extends Shape {

	protected int area()  throws IOException{
		int a=1;
		int b=2;
		int c= 2*a*a*b*b;
		return c;
		
	}
	
	public static void main(String[] args) {
		Square square = new Square();
//		Square sq =new Rectangle();
		
//		sq.area();
		
//		Shape shape = new Shape();
//		System.out.println("print rectangle area:::"+sq.area());
//		System.out.println("print the square area:::"+square.area());
//		 shape.area();
		 
		 

	}

}
