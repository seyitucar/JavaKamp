package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {
	
	List<Skill> findAllByEmployeeId(int employeeId);

}
