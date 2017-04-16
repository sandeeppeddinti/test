package com.practice.nestedclasess;

 class PracticeNested {

	int a=10;

	 class TestNested{
		public void test(){
			int a=4;
			int b=7;
			int c=a+b;	
		System.out.println("print value of test method:::"+c);
		}
	}	
	public void tested(){
	        TestNested testnested=new TestNested();
	        testnested.test();
	}
}

public  class Nested {	
	
	public static void main(String[] args){
		PracticeNested practice= new PracticeNested();
       
		  practice.tested();		
		
		
	}	
}

 
 
 