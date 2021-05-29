package com.seyitucar.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seyitucar.hrmsSpring.entities.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode,Integer> {

}
