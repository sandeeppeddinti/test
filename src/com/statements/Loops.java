package com.statements;

public class Loops {

	public static void main(String[] args) {

		Loops loops = new Loops();

		System.out.println("enhanced forloop::");

		int arr[] = { 1, 2, 3, 4, 5 };

		if (arr.length > 0) {
			System.out.println("inside if");
		} 
		
		if (arr.length ==5) {
			System.out.println("inside else if");
//			return;
		}else {
			System.out.println("else");
		}

		for (int i = 0; i < arr.length; i++) {
			
		}
		
		for (int i : arr) {
			System.out.println(i);
			if (i==3){
				System.err.println("continue.....");
				continue;
			}

		}
//		List of Pesons();
//		Person p = new Person();
		 for(Object i: arr)
		 {
		 System.out.println(i);
		 }

	}
}
