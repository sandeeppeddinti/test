package com.practice.collections.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLoops {

	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.add("sandeep");
		list.add(5);
		list.add("peddinti");
		list.add(9);
		list.add(1);
		list.add(5);
//		for(int i=0;i<list.size();i++){
//			System.out.println("print linked list objects::"+list.get(i));
//		}
//	------------------------------------------------------------------------------Adding an element in specific index -------------->
		list.add(4, "Abhi");
		System.out.println("print index element after adding::"+list);
//--------------------------------------------------------------------------------Adding elements at beginning and ending--------->
		list.addFirst(999);
		list.addLast("madhu");
		System.out.println("print first and last elements after adding::"+list);
//--------------------------------------------------------------------------------Adding element to the front of linked list------>
		list.offerFirst("First Element");
		System.out.println("print the front element:::"+list);
//--------------------------------------------------------------------------------Search elements in linked list-------------->
//		int first=  list.indexOf("peddinti");
		System.out.println("first indexof::::"+list.indexOf("peddinti"));
//-------------------------------------------------------------------------------LinkedList Iterator ------------------------->
		
		System.out.println("How to get last but one::"+list.size());
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
			if(obj.toString().equals("5")){
				System.out.println("this is five");
			}
			String nextString = obj.toString();
			System.out.println("print iterator loop:::"+nextString);
			
			
		}
		List list1 = new ArrayList();
		list1.add("sandeep");
		list1.add(5);
		list1.add("peddinti");
		list1.add(9);
		list1.add(1);
		list1.add(5);
		System.out.println("arrylist #####::"+list1.get(list1.size()-2));
		
	}
	
}
