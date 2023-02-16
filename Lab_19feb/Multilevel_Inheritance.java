package Lab_16feb;
// Ques 2: It is of a multilevel or chain type inheritance.

class Class_A { // base class 
	int a=9;
	int b=7;
	void num() { // method for show
		System.out.println("Two numbers are "+a+" & "+b);
	}}
class Class_B extends Class_A { // sub class for Class_A and base class for Class_C
	Class_A sum=new Class_A();
	int c= sum.a+sum.b;
	void add() {
		System.out.println("Sum of "+sum.a+" & "+sum.b+" is: "+c);
	}}
class Class_C extends Class_B { // sub class 
	Class_B mul=new Class_B();
	int d= mul.c*(mul.a+mul.b); // logic for multiplication
	void mul() {
		System.out.println("Multiplication of "+mul.c+" & "+mul.a+"+"+mul.b+" is: "+d);
}}
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Class_C show=new Class_C();
		show.num();
		show.add();
		show.mul();
	}
}

