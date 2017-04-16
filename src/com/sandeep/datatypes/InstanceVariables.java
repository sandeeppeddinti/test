package com.sandeep.datatypes;

public class InstanceVariables {
	public  PracticeVariables pv= new PracticeVariables();
	
public static void main(String[] arg){
	InstanceVariables iv= new InstanceVariables();
Variables varObject = new Variables();
	
 iv.abc1(varObject);
	
	
	System.out.println(Variables.classVariable);
	
}


public  void abc1(Variables var){
	System.out.println(var.number);
	var.add(5, 3);
	
	
}
 
 

}

