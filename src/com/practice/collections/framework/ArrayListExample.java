package com.practice.collections.framework;

import java.util.ArrayList;

public class ArrayListExample {
	   public static void main(String args[]) {
	      /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  ArrayList<String> obj = new ArrayList<>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  
		  for (String string : obj) {
			  System.out.println(string);
			
		}

		  
		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

//		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");
		  System.out.println(" after adding elemnts:"+obj);

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");
		  System.out.println(" after romovingt elemnts:"+obj);
//
//		  System.out.println("Current array list is:"+obj);
//
		  /*Remove element from the given index*/
		  obj.remove(1);

		  System.out.println("Current array list is:"+obj);
		  obj.clear();
		  System.out.println("print elements::"+obj);
	   }
	}
