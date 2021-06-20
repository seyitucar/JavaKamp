package com.seyitucar.hrmsSpring.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "resumes")
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "creation_date")
	private LocalDate creationDate;
	
	@OneToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "cover_letter_id")
	private CoverLetter coverLetter;
	

	@OneToOne(mappedBy = "resume")
	private Image image;
	

	@OneToMany(mappedBy = "resume")
	private List<School> schools;
	

	@OneToMany(mappedBy = "resume")
	private List<JobExperience> jobExperiences;
	

	@OneToMany(mappedBy = "resume")
	private List<Skill> skills;
	

	@OneToMany(mappedBy = "resume")
	private List<EmployeeLanguage> employeeLanguages;
	
	
	@OneToMany(mappedBy = "resume")
	private List<EmployeeSocialMedia> employeeSocialMedias;
	
}
