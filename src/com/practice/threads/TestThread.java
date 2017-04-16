package com.practice.threads;

public class TestThread {

	public static void main(String args[]) {
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		System.out.println("this is test");
		System.out.println("second test");
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
	}
}
