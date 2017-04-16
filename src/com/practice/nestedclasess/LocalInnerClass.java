package com.practice.nestedclasess;

class LocalClass {
	public void abc() {
		
		int d = 4;
		class InsideClass {
			public void sam() {
				int a = 1;
				int b = 2;
				int c = a + b;
				System.out.println(c);
				System.out.println(d);
			}
		}
		System.out.println("first::"+d);
		InsideClass insideclass = new InsideClass();
		insideclass.sam();
	}

}

public class LocalInnerClass {

	public static void main(String[] args) {
		// LocalInnerClass localinnerclass =new LocalInnerClass();
		LocalClass localclass = new LocalClass();
		localclass.abc();

	}

}
