package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	Resume getByEmployeeId(int employeeId);

}
