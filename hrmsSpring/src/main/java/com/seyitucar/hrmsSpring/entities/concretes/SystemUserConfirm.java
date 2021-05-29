package com.seyitucar.hrmsSpring.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_user_confirms")
public class SystemUserConfirm {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirm_date")
	private Date confirmDate;
	
	public SystemUserConfirm() {
		
	}
	
	public SystemUserConfirm(int id, boolean isConfirmed, Date confirmDate) {
		super();
		this.id = id;
		this.isConfirmed = isConfirmed;
		this.confirmDate = confirmDate;
	}
}
