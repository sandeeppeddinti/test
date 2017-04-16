package com.practice.collections.framework;

import java.util.ArrayList;

public class ListArray {
       
	public static void main(String[] args){
		ArrayList array = new ArrayList();
		
		array.add("sandeep");
		array.add("peddinti");
		array.add("John");
		array.add("Abhi");
		System.out.println("print array list::"+array);
	
		System.out.println("print the index of john::"+array.indexOf("John"));
		
		
		System.out.println("print size of array list:::"+array.size());
		array.clear();
		System.out.println("print true or false if the list is empty:::"+ array.isEmpty());
		
	}
}
