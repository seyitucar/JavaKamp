package com.seyitucar.hrmsSpring.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	public User findByEmailEquals(String email);

}
