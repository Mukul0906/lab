package Lab_9th_March;
// Ques 3
public class Ques_3 {
		public static void main(String[] args) {  
			System.out.println("Array is :");
	        //Initializing & declaring array  
	       int [] arr = new int [] {11,13,16,17,19,25,26,39,29 }; 
	       for(int o:arr)
	       System.out.print(o+" ");
	       System.out.println(); // to print new line
	       
	        System.out.println("Elements of given array present on odd position: ");  
	        //loop for incrementing the array
	        for (int i = 0; i < arr.length; i = i+2) { // incremented by 2 to get odd 
	            System.out.print(arr[i]+" ");  
	        }  
	    }  }
