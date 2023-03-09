package Lab_9th_March;
/* Ques 1: A Java program to find all pairs of elements in 
		   an array whose sum is equal to a specified number. 
*/
public class Ques_1 {
		public static void main(String[] args) {
			int arr [] = {-40,-5,1,3,6,7,8,20,55 }; // initializing and declaring array
			System.out.println("Array is :");
			for (int o:arr) {
				System.out.print(o+" ");			
			}	
			System.out.println(); // for new line
			int sum =15;
			System.out.println("Pairs of the numbers whose sum is 15 are: ");
			Findpair(arr, sum); // method call
		}
		 static void Findpair(int[] arrays, int sum) { // method for finding pair 
			for(int i=0; i<arrays.length;i++) {
				for(int j=i+1; j<arrays.length;j++) {
					if (arrays[i] + arrays[j] == sum) { // sum logic
	                    System.out.println(arrays[i] + " + " + arrays[j] + " = " + sum);
				}
				}}}}		
