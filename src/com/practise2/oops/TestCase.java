package com.practise2.oops;

public class TestCase {
	int a=1;
	int b=3;
	int c=a+b;
 public static int d=3;
 
  public TestCase(int x,int y,int z){
	 a=x;
	 b=y;
	 c=z;
	 int d=x+y+z;
	 
	System.out.println("constructor::"+d); 
 }
 public TestCase(){
	                  //two objects two constructors
 }
    public static void main(String[] args){
    	TestCase tc = new TestCase(1,3,3);
    	System.out.println("print Instance variable::"+ tc.c);
    	TestCase tc2= new TestCase();
    	tc2.a=2;
    	System.out.println("modified Instance variable::"+ tc2.c);//doubt
    	System.out.println("static variable::"+ tc.d);
    	int d=4;
    	System.out.println("modified static variable::not changed::"+ tc2.d);
    	tc.add(5,4);
    	
    }
    public void add(int a,int b){
    	
    	int c=a+b;
    	System.out.println("local variables::"+ c);
    	
    }
}
