package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Employee;

public interface EmployeeService {
	
	Result register (Employee employee);	
	Result logIn (String email);	
	DataResult<List<Employee>> getAll();
	DataResult<Employee> findById(int id);
}
