package com.practice.collections.framework;
import java.util.ArrayList;
import java.util.List;
public class SublistExample {

 public static void main(String a[]){
     ArrayList<String> al = new ArrayList<String>();
     
     System.out.println(al.size());
     System.out.println(al.size());

     //Addition of elements in ArrayList
     al.add("Steve");
     al.add("Justin");
     al.add("Ajeet");
     al.add("John");
     al.add("Arnold");
     al.add("Chaitanya");

     System.out.println("Original ArrayList Content: "+al);

     //Sublist to ArrayList
     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
     System.out.println("SubList stored in ArrayList: "+al2);

     //Sublist to List
     List<String> list = al.subList(1, 4);
     System.out.println("SubList stored in List: "+list);
  }
}