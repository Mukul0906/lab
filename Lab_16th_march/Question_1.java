package LAb_16th_march;
// Question 1 :	 Write a java program to find the maximum occurring character in a string.


public class Question_1 {
	public static void main(String[] args) {  
	      String str = "Write a java program to find the maximum occurring character in a string";    
	      int[] freq = new int[str.length()];    
	      char maxChar = str.charAt(0);    
	      int i, j, max;            	          
	      //string converted into array    
	      char string[] = str.toCharArray();    	             
	      for(i = 0; i < string.length; i++) {    
	          freq[i] = 1;    
	          for(j = i+1; j < string.length; j++) {    
	              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
	                  freq[i]++;    
   
	                  string[j] = '0';    
	              }}}                 
	      max = freq[0];   // checking max occurring characters  
	      for(i = 0; i <freq.length; i++) {           
	          if(max < freq[i]) {    
	              max = freq[i];    
	              maxChar = string[i];    
	          }    
	      }                  
	      System.out.println( maxChar +" is the character that occurs most time.");    
	  }    
}
	
