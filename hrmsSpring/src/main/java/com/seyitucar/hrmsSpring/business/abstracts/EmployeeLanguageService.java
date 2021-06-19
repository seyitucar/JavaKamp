package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageService {
	
	Result add(EmployeeLanguage employeeLanguage);
	DataResult<List<EmployeeLanguage>> getAll();
	DataResult<List<EmployeeLanguage>> getAllByEmployeeId(int employeeId);

}
