package com.practice.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("H:\\practice_ws\\SampleProject\\src\\com\\practice\\files\\input.txt");
         out = new FileOutputStream("H:\\practice_ws\\SampleProject\\src\\com\\practice\\files\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}