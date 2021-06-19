package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Image;


public interface ImageService {

	Result add(Image image);
	DataResult<List<Image>> getAll();
	DataResult<List<Image>> getAllByEmployeeId(int employeeId);
}
