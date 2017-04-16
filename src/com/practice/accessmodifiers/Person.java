package com.practice.accessmodifiers;

public class Person {

	public String name = "sandeep";
	protected	int a ;
	public	int b ;
	public	int c ;
		
	
	 public Person(int s,int p,int n){
		 a=s;
		 b=p;
		 c=n;
		 
	 }
	public Person() {
	}
	
	
	
	
	protected void disyplayName(){
		System.out.println("This is from person objec's name : ");
	}
	
	public static void main(String[] args){
		 Person person=new Person();
	}
	
	}

