package Lab_6th_April;

import java.io.*;

// Question 3 -- Write a java code by using ObjectInput & OutputStream along with transient keyword.

class Car implements Serializable{
	// instance variable
	transient String company; // transient input will not serialized
	String model; 
	int price;
	public Car (String c , String m, int p) { // parameterized constructor
		this.company=c;
		this.model=m;
		this.price=p;
	}
}
public class Question_3 { // main class
	public static void main(String[] args) throws Exception { // main method throws Exception
		Car c =new Car("Tata","Nexon",560000); // constructor arguments
		// serialization
		FileOutputStream fos =new FileOutputStream("E://Car.txt"); // file destination where to write
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c); // to write form object
		oos.flush(); // flush method
		oos.close();
		fos.close(); // close giving output 
		System.out.println("Writing Done");
		// deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E://Car.txt")); // file destinayion where to read
		Car c1 = (Car)ois.readObject();
		System.out.println("Car company :"+c1.company+"  Model :"+c1.model+"  Price :"+c1.price); // For writing data 
		ois.close(); // close taking input
	}
}
