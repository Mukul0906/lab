package Lab_2feb;

public class Test_Ques_2 {
	public static void main(String[] args) {
		int a=10; // local variables
		int b=5;
				
		System.out.println("Before Swapping the numbers are :");
		
        System.out.println("First number = " + a);
        System.out.println("Second Number = " + b);
 
        int c = a; // third variable c
        a = b;
        b = c;
 
        System.out.println("After swapping the numbers are :"); 
        System.out.println("First number = " + a); 
        System.out.println("Second Number = " + b);
	}

}
