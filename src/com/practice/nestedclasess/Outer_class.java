package com.practice.nestedclasess;

public class Outer_class {

	   public static void main(String args[]) {
		   
	      AnonymousInner inner = new AnonymousInner() {
	    	  
	         public void mymethod() {
	            System.out.println("This is an example of anonymous inner class");
	         }
	         public void test(){
	        	 System.out.println("print this example::");
	         }
	      };
	      
	      inner.mymethod();	
	   }
	}