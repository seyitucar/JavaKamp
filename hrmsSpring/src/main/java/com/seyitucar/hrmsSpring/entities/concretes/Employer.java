package com.seyitucar.hrmsSpring.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Employer () {
		
	}
	
	public Employer(int userId, String companyName, String website, String phoneNumber) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}
}
