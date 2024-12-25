package com.Mapping.Student.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mapping.Student.EnityLayer.StudentDetails;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Long>{

}
