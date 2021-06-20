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
@Table(name="schools")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="school_start_date")
	private LocalDate schoolStartDate;
	
	@Column(name="school_graduation_date",nullable = true)
	private LocalDate schoolGraduationDate;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="resume_id")
	private Resume resume; 

    @JsonIgnoreProperties({"firstName","lastName","email","password","nationalityId","birthYear"})
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
}
