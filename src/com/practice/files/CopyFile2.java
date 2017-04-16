package com.practice.files;
import java.io.*;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;

public class CopyFile2 {

	public static void main(String[] args) throws IOException{
		FileReader in=null;
		FileWriter out=null;
		
		try{
			in=new FileReader("H:\\practice_ws\\SampleProject\\src\\com\\practice\\files\\inputt.txt");
			out=new FileWriter("H:\\practice_ws\\SampleProject\\src\\com\\practice\\files\\outputt.txt");
			int c;
	     while((c=in.read()) !=-1){//-----------file not found exception and i/o exception
	    	 out.write(c);
	     }
		}
	     finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
		}
		
		
		
	}
}
