package Lab_16feb;
 // Ques 3: it is a example of hierarchical inheritance
class Teacher{ // base class
	String college="GITM";
	String designation="Teacher";

	void show() {
		System.out.println("College name: "+college+"  Designation: "+designation);
	}}
class IT_Teacher extends Teacher { // sub class
	int Salary=40000;
}
class Maths_Teacher extends Teacher { //sub class
	int Salary=35000;
}
class Soft_Skills_Teacher extends Teacher{ // sub class
		int Salary=25000;
	
public class Ques3  { 
	public static void main(String[] args) { // main method
		IT_Teacher i=new IT_Teacher();
		i.show();
		System.out.println("Salary of IT Teacher is: Rs"+i.Salary);
		Maths_Teacher m=new Maths_Teacher();
		m.show();
		System.out.println("Salary of Maths Teacher is: Rs"+m.Salary);
		Soft_Skills_Teacher s=new Soft_Skills_Teacher();
		System.out.println("Salary of Soft Skills Teacher is: Rs"+s.Salary);		
	}
}}

