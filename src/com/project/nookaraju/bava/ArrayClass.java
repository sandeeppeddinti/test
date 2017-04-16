package com.project.nookaraju.bava;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass {

public static void main(String[] args) {
//	System.out.println(args[0]);
	
	List<Object[]> listOjects = new ArrayList<>();
	Object a1[] ={"Test1",1};
	Object a2[] ={"Test2",2};
	Object a3[] ={"Test3",3};
	Object a4[] ={"Test4",4};
	
	listOjects.add(a1);
	listOjects.add(a2);
	listOjects.add(a3);
	listOjects.add(a4);
	Object[] jdo=null;
	
	String jd="none";
	String separator="";
	
	for (int i = 0; i <listOjects.size(); i++) {
		jdo =listOjects.get(i);
		
		if(i==0){
			separator="";
		}else{
			separator=";";
		}
		jd=jd+separator + " Job:"+ jdo[0]+ ", Id:"+jdo[1]+"";
	}
	
	System.out.println(jd);
	System.out.println(jd.contains("Job:Test1"));

	
//	for(int i=0;i<a.length;i++){
//	  System.out.println(a[i]);
//  }
}
	
	
}
