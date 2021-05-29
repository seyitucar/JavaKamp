package com.seyitucar.hrmsSpring.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_year")
	private Date birthYear;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	public Employee () {
		
	}
	
	public Employee(int userId, String firstName, String lastName, Date birthYear, String nationalityId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalityId = nationalityId;
	}
}
