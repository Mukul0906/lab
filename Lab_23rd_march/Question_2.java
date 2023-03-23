package Lab_23rd_March;
 // Question 2 :

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {
	public static void check(int x, int y) { // static method
		if (x<0 || y<0) { // logic for finding negative
			throw new InputMismatchException("x and y should not be zero "); // throw InputMismatchException
	}
		else {
			int c = (x*y); // logic for product
			System.out.println("Product of "+x+" & "+y+"  is : "+c);
		}
}
	public static void main(String[] args) { // main class
		// creating scanner class
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two integers :"); // taking user input
		int x = in.nextInt(); // integer x
		int y = in.nextInt(); // integer y
		
		// method functioning
		check(x,y);
	}
}

