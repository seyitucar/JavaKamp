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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_experiences")
public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;	
	
	@Column(name="job_place")
	private String jobPlace;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="leave_date",nullable = true)
	private LocalDate leaveDate;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
		
}
