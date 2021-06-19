package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Skill;

public interface SkillService {
	
	Result add(Skill skill);
	DataResult<List<Skill>> getAll();
	DataResult<List<Skill>> getAllByEmployeeId(int employeeId);
}
