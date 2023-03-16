package LAb_16th_march;

import java.util.Scanner;
import java.util.regex.Pattern;

// 	Question 3 : 
	public class MyRegex {
		public static void main(String[] args){
			// creating a scanner class
    Scanner in = new Scanner(System.in);
    System.out.println("Enter ip address : ");
        String IP = in.next(); // taking user input 
        System.out.println(IP.matches(new Matcher().pattern)); // it will match the input ip address
    }
}
//  this class has the pattern at which the inputed ip add will be matched
class Matcher {
public static String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])"; // matching the 3 digit before and after the .(dot)
public static String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255; // to make pattern for the next string
}
  	
	    	