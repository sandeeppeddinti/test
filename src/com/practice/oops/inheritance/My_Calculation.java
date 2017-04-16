package com.practice.oops.inheritance;

public class My_Calculation extends Calculation {

	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}
	

	public static void main(String args[]) {
		
//		My_Calculation cal = (My_Calculation) new Calculation();
		
		int a = 20, b = 10;
		My_Calculation cal = new My_Calculation();
		cal.addition(a, b);
		cal.subtraction(a, b);
		cal.multiplication(a, b);
	}
}