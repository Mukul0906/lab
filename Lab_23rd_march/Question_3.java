package Lab_23rd_March;
/* Questiion 3 : Write a method called addTwoPositive that takes two int parameters, and if either value is not positive,
 * 				 throw an ArithmeticException, passing the string "Non-positive integer sent". to the constructor of the
 *               exception.if the values are both positive, then return the sum of them. Under what circumstances 
 *               will the finally code block be executed in a try/catch/finally segments.
 */
import java.util.Scanner;

public class Question_3 {
	public static void check(int a, int b) { // static method
		try {
			if(a<0 || b<0) { // logic for finding negative
			throw new ArithmeticException("Non-positive integer sent"); // throw InputMismatchException
			}
		else {
			int c = (a+b); // logic for product
			System.out.println("Sum of "+a+" & "+b+"  is : "+c);
		}}
		finally { // final block
			System.out.println("Final block executed.");
		}
}
	public static void main(String[] args) { // main class
		// creating scanner class
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two integers :"); // taking user input
		int a = in.nextInt(); // integer x
		int b = in.nextInt(); // integer y
		
		// method functioning
		check(a,b);
	}
}
