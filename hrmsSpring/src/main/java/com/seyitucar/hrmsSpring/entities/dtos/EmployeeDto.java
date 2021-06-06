package com.seyitucar.hrmsSpring.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private int userId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private LocalDate birthYear;
	private String email;
	private String password;
	
}
