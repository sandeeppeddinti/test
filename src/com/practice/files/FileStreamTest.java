package com.practice.files;

import java.io.*;

public class FileStreamTest {

	public static void main(String args[]) {

		try {
			int bWrite[] = { 11, 21, 3, 40, 5 };
			OutputStream os = new FileOutputStream("H:\\angular\\test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();

			InputStream is = new FileInputStream("H:\\angular\\test.txt");
			int size = is.available();

			for (int i = 0; i < size; i++) {
				System.out.print((int) is.read() + " bWrite" );
			}
			is.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
