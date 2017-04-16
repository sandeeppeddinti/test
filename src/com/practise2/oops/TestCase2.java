package com.practise2.oops;

import com.practice.accessmodifiers.Person;
//import com.practise.oops.Employee;

public class TestCase2 extends Person {


public static void main(String[] arg){
	TestCase2 tc2=new TestCase2();
	   Person per=new Person(1,2,3);
//       System.out.println("print::"+ per.name);
//       per.name="sandy";
//       System.out.println("change the name::"+per.name);
//       System.out.println("change the name::"+per.a +""+ per.b+""+per.c );//error person.a is not visible if aces modifier is not mentioned in another package.

      tc2.disyplayName();
      int a = tc2.a;
}



}