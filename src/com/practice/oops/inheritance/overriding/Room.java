package com.practice.oops.inheritance.overriding;

import java.io.FileNotFoundException;

class Room extends Building{

	void color() throws FileNotFoundException
	   {
	       System.out.println("White");
	   }  
	   public static void main(String args[]){  
	       Building obj = new Room();  
//	       obj.color(); 
	   } 
	}
