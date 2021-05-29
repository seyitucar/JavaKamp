package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}
