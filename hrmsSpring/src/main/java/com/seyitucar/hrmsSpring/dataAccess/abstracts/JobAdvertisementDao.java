package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seyitucar.hrmsSpring.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	public List<JobAdvertisement> getByIsActiveTrue();
	public List<JobAdvertisement> getByEmployerId(int employerId);
	public List<JobAdvertisement> getByIsActiveTrueOrderByApplicationDeadline();
	public List<JobAdvertisement> getByIsActiveTrueOrderByApplicationDeadlineDesc();
	public List<JobAdvertisement> getByIsActiveTrueAndEmployer_CompanyName(String companyName);
	


}
