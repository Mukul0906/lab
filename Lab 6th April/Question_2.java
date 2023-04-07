package Lab_6th_April;

import java.io.*;

// Question 2 --  Write a Java program to read contents from a file into byte array.

public class Question_2 { // main class 
	public static void main(String[] args) throws Exception { // main method throws Exception

		FileReader fr = new FileReader("E:\\byte.txt"); // destination of file 
		// sample text -- Read this Please into the console.
		int i =0; // for starting position
		while((i=fr.read())!=-1) { // loop for taking upto the contents to the end
		char c = (char)i;	
		System.out.println(i+" - char value is :"+c ); // print in ascii value
		}
		fr.close(); // to close reading method
	}
	}