package com.practice.keywordthis;

import com.practice.nonaccessmodifiers.Parent;

class KeywordThis extends Parent {

	int variable = 5;

	KeywordThis() {
		this("ThisKeyWord");
		System.out.println("Inside Constructor without parameter");
	}

	KeywordThis(String str) {
		super(str);
		System.out.println("Inside Constructor with String parameter as " + str);
	}
	
	KeywordThis(String str,String str1) {
		System.out.println("Inside Constructor with String parameter as " + str);
	}


	void method(int variable) {
		variable = 10;

		System.out.println("Value of variable :" + variable);
		System.out.println("This  :" + this.variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}

	public static void main(String args[]) {
		KeywordThis obj = new KeywordThis();
		obj.method(20);
		obj.method();
	}

}
