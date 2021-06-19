package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.EmployeeSocialMedia;

public interface EmployeeSocialMediaDao extends JpaRepository<EmployeeSocialMedia, Integer>{

	List<EmployeeSocialMedia> findAllByEmployeeId(int employeeId);
}
