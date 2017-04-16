package com.practice.nestedclasess;

public class NestedAbstract  {
	
	// method which accepts the object of interface Message
	   public void displayMessage(NestedInterface m) {
	      System.out.println(m.print() +", This is an example of anonymous inner class as an argument");  
	   }
	
       
	public static void main(String[] args) {

		NestedAbstract object = new NestedAbstract();
		object.displayMessage(new NestedInterface() {
			
			@Override
			public String print() {
				
				return "Hello print. from inner class";
			}
		});
	}

	

}
