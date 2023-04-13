package Lab_13th_April;

import java.util.ArrayList;

// problem statement 1

public class Question_1 {
		
		private ArrayList<Integer> A1; // instance variable array list 1 created
		private ArrayList<Integer> A2; // instance variable array list 2 created
		
		// method to store odd numbers upto n and store them in A1 arrayList
		public ArrayList<Integer> storeOddNumbers(int N) { 
			A1 = new ArrayList<Integer>();
			for (int i = 2; i <= N; i++) { //useing for each loop for odd numbers in A1 arraylist
				if (i % 2 != 0) {
					A1.add(i);
				}}
			return A1;		
		}
		// Method to print odd numbers from ArrayList A1 multiplied by 5 and store them in ArrayList A2
		public ArrayList<Integer> printOddNumbers() {
			A2 = new ArrayList<Integer>();
			for (int num : A1) {
			int oddnum = num *5 ;
			System.out.print(oddnum+",");
			A2.add(oddnum);
			}
			return A2;
		}
		// Method to search for number N in ArrayList A1 and return it if found, otherwise return 0
		public int retrieveOddNumber(int N) {
			if (A1.contains(N)) { // from a1 arraylist
				return N;
			}
			return 0;
		}	
		public static void main(String[] args) { // main method
			Question_1 store = new Question_1(); // object created for main class
			store.storeOddNumbers(10); // method invoked and n value assigned 
			store.printOddNumbers(); // method invoked
			System.out.println(); // to print a line
			System.out.println(store.retrieveOddNumber(2));
		}
}
