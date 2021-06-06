package com.seyitucar.hrmsSpring.adapters;

import com.seyitucar.hrmsSpring.entities.concretes.Employee;

public interface UserCheckService {
	
	public boolean checkIfRealPerson(Employee employee);

}
