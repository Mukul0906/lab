package Lab_30_March;

// problem statement = 1
public class ListLoader {//  main class
	
	public void loadList(int startNumber,int lastNumber) {	
		int[] Arr = new int[100]; // array fot 100 integers
		for (int i=startNumber; i<=lastNumber;i++) { // for loop
		System.out.println(i);
	}}
	public static void main(String[] args) { // main method
		ListLoader l =new ListLoader(); // creating object for main class 
		l.loadList(0, 100); // void return with variables
		int time1=  (int) System.currentTimeMillis(); // to count time 
		System.out.println("Elapsed time in milli sec: "+time1);
	}
}
