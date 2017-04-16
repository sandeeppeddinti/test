package com.practice.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFound_Demo {

	public int method() {
		FileInputStream file = null;

		try {
			int y =8/0;
			file = new FileInputStream("Test.txt");
			int x = (byte) file.read();
		} catch (FileNotFoundException i) {
			System.out.println("filenot found not found exception block");
			i.printStackTrace();
			return -1;
		}catch (IOException e) {
			System.out.println("IO exception");
		} 
		catch (ArithmeticException aiobe) {
			System.out.println("other catch");
			aiobe.printStackTrace();
			return -1;
		}
		return 0;
	}

	public static void main(String args[]) {
		File file1 = new File("E://file.txt");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		try {
//			FileReader fr = new FileReader(file1);
		} catch (Exception e) {
			System.out.println("exceptin caught ::" + e);
		} finally{
			System.out.println("This is finally block");
		}
		
		
//
//		FilenotFound_Demo obj = new FilenotFound_Demo();
//		obj.method();

		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1****************");

		System.out.println("the end");

	}
}
