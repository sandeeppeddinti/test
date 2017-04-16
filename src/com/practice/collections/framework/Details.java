package com.practice.collections.framework;

import java.util.*;
public class Details  {

	public static void main(String args[]){
	   ArrayList<Integer> listofcountries = new ArrayList<>();
	   listofcountries.add(5);
	   listofcountries.add(9);
	   listofcountries.add(3);
	   listofcountries.add(7);

	   /*Unsorted List*/
	   System.out.println("Before Sorting:");
	   for(int counter: listofcountries){
			System.out.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(listofcountries);

	   /* Sorted List*/
	   System.out.println("After Sorting:");
	   for(int counter: listofcountries){
			System.out.println(counter);
		}
	   Collections.reverse(listofcountries);
	   System.out.println("After reverse sorting:::");
	   for(int i:listofcountries){
		   System.out.println(i);
	   }
	}
}
