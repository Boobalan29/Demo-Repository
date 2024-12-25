package com.Mapping.Student.EnityLayer;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String department;
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL, orphanRemoval=false)
	private List<StudentDetails> student =new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<StudentDetails> getStudent() {
		return student;
	}
	public void setStudent(List<StudentDetails> student) {
		this.student = student;
	}
	public Department(Long id, String department, List<StudentDetails> student) {
		super();
		this.id = id;
		this.department = department;
		this.student = student;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
