package com.example.codeclan.employee;

import com.example.codeclan.employee.models.Department;
import com.example.codeclan.employee.models.Employee;
import com.example.codeclan.employee.repositories.DepartmentRepository;
import com.example.codeclan.employee.repositories.EmployeeRepository;
import com.example.codeclan.employee.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Employee employee1 = new Employee("Piotr", "Gryko", 0001);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Pete", "Brodie", 0002);
		employeeRepository.save(employee2);
		Department department1 = new Department("Fun");
		departmentRepository.save(department1);
		department1.addEmployee(employee1);
		departmentRepository.save(department1);
		department1.addEmployee(employee2);
		departmentRepository.save(department1);

	}





}
