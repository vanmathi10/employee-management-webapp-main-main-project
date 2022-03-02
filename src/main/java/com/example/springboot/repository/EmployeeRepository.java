package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	static void save(EmployeeRepository employeeRepository) {
		// TODO Auto-generated method stub
		
	}

	static boolean existsById(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	static void saveAll(EmployeeRepository employeeRepository) {
		// TODO Auto-generated method stub
		
	}

	

	
}
