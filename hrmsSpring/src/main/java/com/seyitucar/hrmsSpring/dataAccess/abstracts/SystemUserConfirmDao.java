package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.SystemUserConfirm;

public interface SystemUserConfirmDao extends JpaRepository<SystemUserConfirm,Integer> {

}
