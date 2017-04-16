package com.sandeep.datatypes;

public class PracticeVariables {
	public static String a = "sandeep";
	String b = "peddinti";
	int id = 123;
	
	public  Variables var = new Variables();

	public static void main(String[] args) {
		PracticeVariables pv = new PracticeVariables();
		pv.a = "abcd";
		PracticeVariables pv2 = new PracticeVariables();
		pv2.a = "sandy";
		pv2.id = 321;
		System.out.println("static variables::" + pv.a + "  " + pv.b);
		System.out.println("static variables::" + pv2.a + "  " + pv2.b);
		System.out.println("Instance variables::" + pv.id);
		System.out.println("Instance variables after modified with new obj::" + pv2.id);
		abc(5, 3);

	}

	public static void abc(int x, int y) {
		String[] s = { "sam", "john", "singh" };
		String[] t = { "abhi", "madhu" };
		int u = x;
		int v = y;
		int z = x - y;
		System.out.println(z);
		System.out.println(s[0]);
		System.out.println(t[1]);

	}

}
