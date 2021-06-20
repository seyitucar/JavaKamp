package com.seyitucar.hrmsSpring.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_experiences")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;	
	
	@Column(name="job_place")
	private String jobPlace;
	
	@Column(name="job_start_date")
	private LocalDate jobStartDate;
	
	@Column(name="job_leave_date",nullable = true)
	private LocalDate jobLeaveDate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "resume_id")
	private Resume resume;
	
    @JsonIgnoreProperties({"firstName","lastName","email","password","nationalityId","birthYear"})
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employee employee;
		
}
