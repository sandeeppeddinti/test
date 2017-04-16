package com.practice.nestedclasess;

class Outer_Demo {
//	int num;
	 private int num = 175;  
	// inner class
	private class Inner_Demo {
		private int a=10;
		public void print() {
			System.out.println("This is an inner class");
		}
		
		public int getNumber(){
			return num;
		}
	}

	// Accessing he inner class from the method within
	void display_Inner() {
		Inner_Demo inner = new Inner_Demo();
		inner.print();
		System.out.println(inner.a);
	}
	// Accessing he inner class from the method within
	int return_Inner() {
		Inner_Demo inner = new Inner_Demo();
		return inner.getNumber();
	}
}
