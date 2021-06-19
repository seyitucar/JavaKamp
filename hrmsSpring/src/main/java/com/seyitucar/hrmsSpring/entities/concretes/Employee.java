package com.seyitucar.hrmsSpring.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.seyitucar.hrmsSpring.core.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
public class Employee extends User {

	@Id
	@Column(name="user_id")
	private int id;
	
	@Column(name="first_name")
	@NotBlank
	@NotNull
	private String firstName;
	
	@Column(name="last_name")
	@NotBlank
	@NotNull
	private String lastName;
	
	@Column(name="nationality_id")
	@NotBlank
	@NotNull
	private String nationalityId;
	
	@Column(name="birth_year")
	@NotBlank
	@NotNull
	private LocalDate birthYear;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<School> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<JobExperience> jobExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<Image> images;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<EmployeeLanguage> employeeLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<EmployeeSocialMedia> employeeSocialMedias;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<Skill> skills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<CoverLetter> coverLetters;
}
