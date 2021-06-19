package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.seyitucar.hrmsSpring.entities.concretes.JobAdvertisement;
import com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByEmployerId(int employerId);
	
	@Query("Select new com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto(id, jobTitle.titleName, employer.companyName, numberOfOpenPosition, applicationDeadline, createdAt) From JobAdvertisement where isActive=:activityStatus")
	List<JobAdvertisementDto> getByActivity(@Param ("activityStatus") boolean activityStatus);

	@Query("Select new com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto(id, jobTitle.titleName, employer.companyName, numberOfOpenPosition, applicationDeadline, createdAt) From JobAdvertisement where isActive=:activityStatus Order By applicationDeadline ")
	List<JobAdvertisementDto> getByActivityOrderByApplicationDeadline(@Param ("activityStatus") boolean activityStatus);
	
	@Query("Select new com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto(id, jobTitle.titleName, employer.companyName, numberOfOpenPosition, applicationDeadline, createdAt) From JobAdvertisement where isActive=:activityStatus Order By applicationDeadline Desc ")
	List<JobAdvertisementDto> getByActivityOrderByApplicationDeadlineDesc(@Param ("activityStatus") boolean activityStatus);
	
	@Query("Select new com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto(j.id, jt.titleName, e.companyName, j.numberOfOpenPosition, j.applicationDeadline, j.createdAt) From JobAdvertisement j Inner join j.employer e Inner join j.jobTitle jt where e.companyName=:companyName and j.isActive=:activityStatus")
	List<JobAdvertisementDto> getByActivityAndCompanyName(@Param ("activityStatus") boolean activityStatus, @Param ("companyName") String companyName);
}
