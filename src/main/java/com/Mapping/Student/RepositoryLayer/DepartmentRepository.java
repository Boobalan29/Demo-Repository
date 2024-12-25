package com.Mapping.Student.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mapping.Student.EnityLayer.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
