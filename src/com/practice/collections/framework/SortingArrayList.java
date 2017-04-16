package com.practice.collections.framework;

import java.util.ArrayList;

public class SortingArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<>();
		ArrayList obj1 = new ArrayList();
		obj.add(2);
		obj.add(5);
		obj.add(1);
		obj.add(7);
		obj.add(9);
		obj.add(null);
		
		
		obj1.add("one");
		obj1.add("two");
		obj1.add("null");
		
		
		for (int i = 0; i < obj.size(); i++) {
			System.out.println("print list::" + obj.get(i));
		}
		for (int i = 0; i < obj.size(); i++) {

		}
		
		
//		obj.clear();
//		obj.removeAll(obj1);
//		obj.remove(new Integer(7));
		Object result = obj1.remove(0);
		
		System.out.println(result);
		System.out.println("after remove all list:::"+obj);
		
	}
}
