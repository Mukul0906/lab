package LabC;
	// Question 3 : Create a Student class to take different types constructor to set different properties ( values ).

public class Student { 
	Student(){ // default constructor
		System.out.println("This following is a student class of GITM college :");
	}
	// parameterized constructor
	// data of students
		int age;
		String name;
		int rollno;
		static String cllg="GITM";
		Student(int a, String b,int c){
			rollno=a;
			name=b;
			age=c;	
		}
		void show() {
			System.out.println(cllg+" Roll No. : "+rollno+"  Name : "+name+"  Age : "+age); // main line
		}
		public static void main(String[] args) {
			Student student=new Student(); // method
			// student data
			Student c= new Student(19, "Mukul",22); 
			Student c1= new Student(89,"Arvind",24);
			Student c2= new Student(60, "Saurav",21);
			Student c3= new Student(60, "Rohit",23);
		c.show(); // to show data
		c1.show();
		c2.show();
		c3.show();
		}
}