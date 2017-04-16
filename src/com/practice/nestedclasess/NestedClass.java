package com.practice.nestedclasess;
// Inner classes --Accessing private members
import com.practice.nestedclasess.Demo_Class.Inner_Demo;

class Demo_Class{
	private int san=444;
	
	class Inner_Demo{
		public int getint(){
			System.out.println("print");
			return san;
		};
		
	}
}
public class NestedClass {
   public static void main(String[] args){
	   Demo_Class demo=new Demo_Class();
	   Demo_Class.Inner_Demo inner =demo.new Inner_Demo();
	   System.out.println("print::"+inner.getint());
   }
}
