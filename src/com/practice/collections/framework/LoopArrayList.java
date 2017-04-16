package com.practice.collections.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopArrayList {

	public static void main(String[] args){
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(6);
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		
//		for(int i=0;i<obj.size();i++){
//			System.out.println("print first value::"+obj.get(i));
//		}
		
//		int j=0;
//		while(j<obj.size()){
//			System.out.println("Print while loop first value::"+obj.get(j));
//			j++;
//		}
//		 Iterator iter = obj.iterator();
//	      while (iter.hasNext()) {
//	         System.out.println(iter.next());
//	      }
         for (int a: obj) {
			System.out.println(a);
		}
	}
}
