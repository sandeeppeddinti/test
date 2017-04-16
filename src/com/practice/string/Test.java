package com.practice.string;

public class Test {

	public static void main(String args[]) {
		Double x = 5.06700;
        Character i=10;
        Float floatValue=2.086700623f;
        
        
		// Returns byte primitive data type
		System.out.println(x.intValue());

		// Returns double primitive data type
		System.out.println(x.doubleValue());
		System.out.println("float value::"+floatValue.floatValue());
		

		// Returns long primitive data type
		System.out.println(x.floatValue());
// wrapper Number class---- compareTo
		System.out.println("compareto value::"+x.compareTo(7.0));
		System.out.println("print char value::"+i.isDigit(i));
	}
}
