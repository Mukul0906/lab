package Lab_Question_1;
// Lab Question 1

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Theater_info")

public class Theater {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Movie_id")
	private int mid;
	private String Movie_Name;
	// getter and setter method
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
	return Movie_Name;
	}
	public void setMname(String Mname) {
	this.Movie_Name = Mname;
	}
	public Theater(int mid, String movie_Name) { 
		super();
		this.mid = mid;
		this.Movie_Name = movie_Name;
	}
	@Override
	// generated tostring
	public String toString() {
		return "Theater [mid=" + mid + ", Movie_Name=" + Movie_Name + "]";
	}
}
