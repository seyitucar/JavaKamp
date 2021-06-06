package com.seyitucar.hrmsSpring.business.abstracts;

import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Employee;

public interface EmployeeService {
	
	Result register (Employee employee);

}
