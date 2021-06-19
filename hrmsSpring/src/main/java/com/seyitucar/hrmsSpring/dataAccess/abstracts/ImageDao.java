package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer>{
	
	List<Image> findAllByEmployeeId(int employeeId);

}
