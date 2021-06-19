package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.CoverLetter;

public interface CoverLetterService {
	
	Result add(CoverLetter coverLetter);
	DataResult<List<CoverLetter>> getAll();
	DataResult<List<CoverLetter>> getAllByEmployeeId(int employeeId);

}
