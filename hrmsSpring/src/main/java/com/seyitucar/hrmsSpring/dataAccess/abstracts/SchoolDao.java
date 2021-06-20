package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer> {
	
	List<School> findAllByEmployeeIdOrderBySchoolGraduationDateDesc(int employeeId);

}
