package com.seyitucar.hrmsSpring.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

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
@Table(name="job_advertisement")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","city","employer","jobTitle"}) 

public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="is_active", columnDefinition = "boolean default false")
	private boolean isActive;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="closing_date")
	private LocalDate closingDate;

	@ManyToOne
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitle;

	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;

	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;

	@ManyToOne
	@JoinColumn(name="working_type_id")
	private WorkingType workingType;
	
	@ManyToOne
	@JoinColumn(name="working_place_id")
	private WorkingPlace workingPlace;
	
}
