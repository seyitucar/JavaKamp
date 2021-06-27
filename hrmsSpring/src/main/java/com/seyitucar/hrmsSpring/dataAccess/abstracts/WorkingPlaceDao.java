package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.WorkingPlace;

public interface WorkingPlaceDao extends JpaRepository<WorkingPlace, Integer> {

}
