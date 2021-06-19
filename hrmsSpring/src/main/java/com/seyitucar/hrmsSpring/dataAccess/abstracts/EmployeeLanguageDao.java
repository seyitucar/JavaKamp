package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageDao extends JpaRepository<EmployeeLanguage, Integer> {

	List<EmployeeLanguage> findAllByEmployeeId(int employeeId);
}
