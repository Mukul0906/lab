package LAb_16th_march;
//  Question 2 : Write a java program to reverse every word in string.

public class Question_2 {
	public static void main(String[] args) {
		// take a statement
		String str = "Reverse this statement"; // taking string by literals
		System.out.println("Original string is: "+str);
		
		StringBuffer s=new StringBuffer(str); // creating string buffer for modify string 
		s.reverse(); // method to reverse string
		System.out.println("After reversing :"+ s);
	} 
}
