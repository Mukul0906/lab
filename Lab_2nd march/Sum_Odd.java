package Lab_2nd_March;
// Ques 3.

import java.util.Scanner;

public class Sum_Odd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // creating scanner class
		System.out.print("Enter numbers where upto odd numbers sum is needed : ");
		int num = in.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {      
		    if (i % 2 != 0) { // logic for odd number
		        sum = sum + i; // to sum odd numbers one by one 
		    }
		}
		System.out.println("Sum of odd numbers upto "+num+" is : "+sum); // print sum of odd  numbers
	}
}
