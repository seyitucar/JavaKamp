package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.JobAdvertisement;
import com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	Result setStatus(int jobAdvertisementId, int employerId, boolean status);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getByEmployerId(int employerId);
	DataResult<List<JobAdvertisementDto>> getByActivity(boolean status);
	DataResult<List<JobAdvertisementDto>> getByActivityOrderByApplicationDeadline(boolean status);
	DataResult<List<JobAdvertisementDto>> getByActivityOrderByApplicationDeadlineDesc(boolean status);
	DataResult<List<JobAdvertisementDto>> getByActivityAndCompanyName(boolean status, String companyName);
}
