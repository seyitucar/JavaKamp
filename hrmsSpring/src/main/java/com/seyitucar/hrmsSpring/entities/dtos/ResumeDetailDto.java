package com.seyitucar.hrmsSpring.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import com.seyitucar.hrmsSpring.entities.concretes.CoverLetter;
import com.seyitucar.hrmsSpring.entities.concretes.Employee;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeLanguage;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeSocialMedia;
import com.seyitucar.hrmsSpring.entities.concretes.Image;
import com.seyitucar.hrmsSpring.entities.concretes.JobExperience;
import com.seyitucar.hrmsSpring.entities.concretes.School;
import com.seyitucar.hrmsSpring.entities.concretes.Skill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDetailDto {
	
	private int id;
	private LocalDate creationDate;
	private Employee employee;
	private CoverLetter coverLetter;
	private Image image;
	private List<School> schools;
	private List<JobExperience> jobExperiences;
	private List<Skill> skills;
	private List<EmployeeLanguage> employeeLanguages;
	private List<EmployeeSocialMedia> employeeSocialMedias;

}
