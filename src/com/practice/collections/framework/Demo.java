package com.practice.collections.framework;

import java.util.ArrayList;
public class Demo
{
     public static void main(String [] args)
     {
          ArrayList<Student> al= new ArrayList<Student>();
          Student student = new Student("Chaitanya", 26);
          System.out.println("student:::"+student);
		al.add(student);
          al.add(new Student("Ajeet", 25));
          al.add(new Student("Steve", 55));
          al.add(new Student("Mary", 18));
          al.add(new Student("Dawn", 22));
          for (Student tmp: al){
              System.out.println(tmp);
          }
     }
}