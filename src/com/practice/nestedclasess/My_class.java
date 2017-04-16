package com.practice.nestedclasess;

public class My_class {

	   public static void main(String args[]) {
	      // Instantiating the outer class 
	      Outer_Demo outer = new Outer_Demo();
//	      Inner_Demo obj = new Inner_Demo();
	      
	      // Accessing the display_Inner() method.
	      outer.display_Inner();
	      System.out.println(outer.return_Inner());
	   }
	}