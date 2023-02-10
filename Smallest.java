package LabC;

import java.util.Scanner;
	//	Question 2 : Write a Java method to find the smallest number among three numbers. 

public class Smallest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // scanner created

		 int num1,num2,num3;
	           System.out.println("Enter three numbers:");
	           // take input number from user
	           num1=sc.nextInt();
	           num2=sc.nextInt(); 
	           num3=sc.nextInt();
	           // logic for smallest number
	           if(num1 < num2 && num1 < num3) // if no1 is smallest
               {
	              System.out.println("The The smallest number among the three numbers is : "+num1);
               }
            else if(num2 < num3) // if no2 is smallest 
               {
	               System.out.println("The smallest number among the three numbers is : "+num2);
               }
            else // if no3 is smallest
               {
	               System.out.println("The Smallest Is"+num3);
               }
	}
}
