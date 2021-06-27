package com.seyitucar.hrmsSpring.entities.dtos;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	
	private int id;
	private String titleName;
	private String companyName;
	private String workingTypeName;
	private String workingPlace;
	private int numberOfOpenPosition;
	private LocalDate applicationDeadline;
	private Date createdAt;
	
}
