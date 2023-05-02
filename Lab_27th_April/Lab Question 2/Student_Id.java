package Lab_Question_2;

// Lab question - 2

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="Student_id_details") // create table name

public class Student_Id {
@Id // to make primary key
@Column(name="Student") // column name
	private int serial_id;
	private int Student_id;
	
	// getter and setter method
	public int getSerial_id() {
	return serial_id;
}
	public void setSerial_id(int serial_id) {
	this.serial_id = serial_id;
}
	public int getStudent_id() {
	return Student_id;
}
	public void setStudent_id(int student_id) {
	Student_id = student_id;
}
	// parameterized constructor
	public Student_Id(int student_id) {
		super();
		Student_id = student_id;
	}	
}
