package com.Mapping.Student.StudentTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Mapping.Student.EnityLayer.Department;
import com.Mapping.Student.EnityLayer.StudentDetails;
import com.Mapping.Student.RepositoryLayer.DepartmentRepository;
import com.Mapping.Student.RepositoryLayer.StudentDetailsRepository;

@SpringBootTest
public class StudentRepositoryTest {
	@Autowired
	private StudentDetailsRepository studentRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Test
	public void saveStudentTest()
	{
		StudentDetails student=new StudentDetails();
		student.setStudentName("Boobalan");
		student.setAdress("Namakkal");
		student.setRollNo("101001");
		student.setPhoneNo("9487748320");
		
		Department dept=new Department();
		dept.setDepartment("Java");
		dept=departmentRepository.save(dept);
		
		student.setDepartment(dept);
		
		studentRepository.save(student);
		
	}

}
