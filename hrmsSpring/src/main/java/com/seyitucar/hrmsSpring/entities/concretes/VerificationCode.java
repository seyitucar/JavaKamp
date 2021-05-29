package com.seyitucar.hrmsSpring.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="verification_codes")
public class VerificationCode {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@Column(name="verified_date")
	private Date verifiedDate;
	
	public VerificationCode () {
		
	}
	
	public VerificationCode(int id, String code, boolean isVerified, Date verifiedDate) {
		super();
		this.id = id;
		this.code = code;
		this.isVerified = isVerified;
		this.verifiedDate = verifiedDate;
	}
}
