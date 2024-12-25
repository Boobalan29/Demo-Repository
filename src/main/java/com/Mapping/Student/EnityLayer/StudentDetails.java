package com.Mapping.Student.EnityLayer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String studentName;
	@Column(nullable=false,unique=true)
	private String rollNo;
	private String adress;
	@NotNull
	private String phoneNo;
	@ManyToOne
	@JoinColumn(name="depatment_Id")
	private Department department;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public StudentDetails(Long id, String studentName, String rollNo, String adress, String phoneNo,
			Department department) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.adress = adress;
		this.phoneNo = phoneNo;
		this.department = department;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
