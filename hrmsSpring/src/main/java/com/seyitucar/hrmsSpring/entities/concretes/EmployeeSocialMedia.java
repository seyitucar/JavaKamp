package com.seyitucar.hrmsSpring.entities.concretes;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_social_medias")
public class EmployeeSocialMedia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="social_media_id")
	private SocialMedia socialMedia;
	
	@Column(name="social_media_adress")
	private String socialMediaAdress;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employee employee;

}
