package com.practice.collections.framework;

import java.util.ArrayList;

public class ExceptionDemo {
  public static void main(String args[]){
     ArrayList<String> books = new ArrayList<String>();
     books.add("C");
     books.add("Java");
     books.add("Cobol");
     for(String obj : books) {
        System.out.println(obj);
        //We are adding element while iterating list
        books.add("C++");
     }
  }
}
