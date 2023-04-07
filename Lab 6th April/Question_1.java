package Lab_6th_April;

// Question 1 -- create a java program to read n print the content to/from the file.

import java.util.Scanner;
import java.io.*;

public class Question_1 {
	public static void main(String[] args) throws IOException { // main method with throws exception
		Scanner in = new Scanner(System.in); // creating scanner
		System.out.println("Enter 1 to store data:"); 
		int i =in.nextInt(); // scanner user input
	// for storing data
		if (i==1) {
			FileOutputStream fos = new FileOutputStream("E:\\Lab.txt"); // file destination to write data
			String s ="Program for stroing and writing data. "; 
			byte b[] = s.getBytes(); 
			fos.write(b); // to write 
			fos.close();
			System.out.println("Lab Assignment for writing and reading data done.");	
			}
		else { System.out.println("Wrong keyword only 1 allowed.");
		}
		System.out.println("Enter 2 to write data:");
		int j=in.nextInt(); // scanner user input
	// for writing data	
		if (j==2) {
				// file source
				FileInputStream fis = new FileInputStream("E:\\Lab.txt"); // file destination to read data
				int k=0; // for starting pos
				while((i=fis.read())!=-1) { // loop for take all characters 
					System.out.print((char)i); // convert i into char 
				}
				fis.close(); // close method
		}
		else { System.out.println("Wrong keyword only 2 allowed.");
		}
		}
}
