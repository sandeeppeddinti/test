package com.operators;

public class ModulusOperater {
    int a=7;
    int b=2;
    int c=a%b;
    //----------------------- method-----------------
   public void abc(){
	   int d=10;
	   int e=11;
	//   int f=d^e;
	   int f=d+e;
	   f += f;
	   System.out.println("print assignment operator it doubles if + and - 0 operator::"+ f);
	   int a=2;
	   int b=7;
	   int c=2;
	   c%=a;
	   System.out.println("print multiple assignment operator"+ c);
   }
  // ---------------------constructor--------------------
    public ModulusOperater(int i,int j){
         int k=i>j?a:b;	
    	System.out.println("print conditional operator::"+k);
    }
	public static void main(String[] args) {
     ModulusOperater obj=new ModulusOperater(10,20);
     System.out.println(obj.c);
     obj.abc();
	}
//----------------------constructor------------
	public ModulusOperater(){
		
	}
	
}
