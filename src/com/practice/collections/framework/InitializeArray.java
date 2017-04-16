package com.practice.collections.framework;

import java.util.*;

public class InitializeArray {
   public static void main(String args[]) {
	   ArrayList<String> intlist = new ArrayList<>(Collections.nCopies(5, "sandeep"));
	  System.out.println("ArrayList items: "+intlist);
   }
}
