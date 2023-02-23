package Lab_23_feb;
// Question 2

class Employee { // parent class
	int incrementSalary() { 
		return 0;		
	}}
class Developer extends Employee {	// child class of developer  class
	int incrementSalary() { // increased percentage for developers 
		return 25;
	}}
class Manager extends Employee {	// child class of manager  class
	int incrementSalary() { // increased percentage for manager
		return 35;
	}}
public class Question_2 {
	public static void main(String[] args) {
		int salaryofdeveloper=25000; // salary of developer
		int salaryofmanager=35000; 	// salary of manager
		// creating parent class reference variable	
		Employee emp;
		emp =new Developer();
		System.out.println("Current salary of Developer :"+salaryofdeveloper);
		System.out.println("Increasaed amount to be added in salary of Developer :"+((salaryofdeveloper*emp.incrementSalary())/100));
		emp =new Manager();
		System.out.println("Current salary of Manager :"+salaryofmanager);
		System.out.println("Increasaed amount ofto be added in salary Manager :"+((salaryofmanager*emp.incrementSalary())/100));
	}
}
