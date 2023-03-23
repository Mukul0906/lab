package Lab_23rd_March;

import java.util.Scanner;
// Question 1
	public class Ques_1 {
		public static void main(String[] args) throws Exception {
			Scanner in = new Scanner(System.in);
	
			try {
				// 1st inner try block
				try { 
					System.out.println("Enter first sample input");
					int a = in.nextInt();
					int b = in.nextInt();
					System.out.println(a/b);
				}
				catch (ArithmeticException e) {
					System.out.println(e);
				}
				// 2nd try block
				try {
					System.out.println("Enter second sample input");
					int a = in.nextInt();
					int b = in.nextInt();
					System.out.println(a/b);
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
			// outer catch block
			catch (Exception e) {
				System.out.println(e);
			}
			
			print(); // for sample output 3
			show();  // for sample output 4
			
		}
		// for sample input 3
		static void print() {
			try {
				System.out.println("Third sample input");
				int x=10;
				int y=0;
				System.out.println(x/y);
			}	
			catch(Exception e) {
				System.out.println(e);
			}}
		// for sample input 4
		static void show() {
			try {
				System.out.println("Fourth sample input");
				double x= 23.323;
				int y =0;
				System.out.println(x/y);
			}
			catch (Exception e) {
				System.out.println(e);
			}}		
		}