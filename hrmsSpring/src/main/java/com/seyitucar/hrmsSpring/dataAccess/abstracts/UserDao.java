package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {

}
