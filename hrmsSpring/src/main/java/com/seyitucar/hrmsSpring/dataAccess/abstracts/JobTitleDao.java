package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
	
	JobTitle findByTitleNameEquals(String titleName);

	
	

}
