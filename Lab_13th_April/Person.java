package Lab_13th_April;

import java.util.ArrayList;

/* Ques 2 - Create a Person class and create an array list to add 10 person objects
			and print them using a for each loop  */

public class Person {
	public static void main(String[] args) { // main method
		// creating an array list 
		ArrayList<String> arl = new ArrayList<String>(); // creating an array list
			// add person using arraylist objects
			arl.add("Mukul"); 		// 1
			arl.add("Saurav"); 		// 2
			arl.add("Aman"); 		// 3
			arl.add("Tushar"); 		// 4
			arl.add("Arvind"); 		// 5
			arl.add("Shishank"); 	// 6
			arl.add("Pankaj"); 		// 7
			arl.add("Eshaan"); 		// 8
			arl.add("Rahul"); 		// 9 
			arl.add("Mandip");		// 10
	
	// printing person name using for each loop
	for (int i=0;i<arl.size();i++) {
		System.out.println("Name of person is : " +arl.get(i)); // to print names
	}	
}
}
