package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.School;

public interface SchoolService {

	Result add(School school);
	DataResult<List<School>> getAll();
	DataResult<List<School>> findAllByEmployeeIdOrderByGraduationDateDesc(int employeeId);
}
