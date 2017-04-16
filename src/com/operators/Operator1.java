package com.operators;

public class Operator1 extends ModulusOperater {
  
	

	

	public static void main(String[] args){
		Operator1 op=new Operator1();
		ModulusOperater obj=new ModulusOperater();
		System.out.println("print instance of::"+ (op instanceof Operator1));
         int a=10;
         int b=20;
         int c=30;
       //  int d=a*b/c;
         int d=++a ;
//         int x=a;
         System.out.println("post operator::"+d);
//         System.out.println("post operator::"+a);
         
         int i=3;
         int j=++i;
         System.out.println("unary operators::"+j);
         int e=5;
         int f=8;
         int g=10;
         int h=(c/g)+e*f;
         System.out.println("print h value::"+h );
	}
}
