package Lab_Question_2;
//lab question 2

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Student_details")

public class StudentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Student_identity")
	private int id;
	private String Student_Name;
	private String Student_Stream;
	private String Student_address;
	
	@OneToOne(cascade=CascadeType.ALL) // for one to one connection
	@JoinColumn(name="Student_id") // join column 

	private Student_Id sid;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	// getter and setter method
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getStudent_Stream() {
		return Student_Stream;
	}
	public void setStudent_Stream(String student_Stream) {
		Student_Stream = student_Stream;
	}
	public String getStudent_address() {
		return Student_address;
	}
	public void setStudent_address(String student_address) {
		Student_address = student_address;
	}
	public Student_Id getSid() {
		return sid;
	}
	public void setSid(Student_Id sid) {
		this.sid = sid;
	}
	// parameterized contructor
	public StudentDetails(String student_Name, String student_Stream, String student_address) {
		super();
		Student_Name = student_Name;
		Student_Stream = student_Stream;
		Student_address = student_address;
	}
public StudentDetails() {
}
}
