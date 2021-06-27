package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.entities.concretes.SystemUser;

public interface SystemUserService {
	
	DataResult<List<SystemUser>> getAll();

}
