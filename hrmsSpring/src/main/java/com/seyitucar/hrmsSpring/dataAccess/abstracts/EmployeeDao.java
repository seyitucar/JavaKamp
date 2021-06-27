package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.Employee;


public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	
	 Employee findByNationalityIdEquals(String nationalityId);
	 Employee findById(int id);
}
