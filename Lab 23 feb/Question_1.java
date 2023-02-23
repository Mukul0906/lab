package Lab_23_feb;
// Question 1

class Bank { // parent class
	float getRateOfinterest() {
		return 0;
	}}
class SBI extends Bank {
	float getRateOfinterest() {
		return 8;
	}}
class ICICI extends Bank {
	float getRateOfinterest() {
		return 7;
	}}
class AXIS extends Bank {
	float getRateOfinterest() {
		return 9;
	}}
public class Question_1 {
	public static void main(String[] args) {
		Bank roi;
		roi=new SBI();
		System.out.println("Rate of interest for SBI bank is :"+roi.getRateOfinterest()+"%");
		roi=new ICICI();
		System.out.println("Rate of interest for ICICI bank is :"+roi.getRateOfinterest()+"%");
		roi=new AXIS();
		System.out.println("Rate of interest for AXIS bank is :"+roi.getRateOfinterest()+"%");
	}
}
