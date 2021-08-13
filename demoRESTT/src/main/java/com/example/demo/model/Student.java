package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name="StudentRegistration")
public class Student {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int studentId;
	
	@Column(name="studentname")
	private String studentname;

	@Column(name="email")
	private String email;
	

	public Student(String studentname, String email) {
		super();
		this.studentname = studentname;
		this.email = email;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", email=" + email + "]";
	}
}
