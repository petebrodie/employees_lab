package com.example.codeclan.employee.repositories;


import com.example.codeclan.employee.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>  {
}
