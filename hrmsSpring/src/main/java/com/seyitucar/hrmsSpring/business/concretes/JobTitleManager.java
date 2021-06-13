package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.business.BusinessRules;
import com.seyitucar.hrmsSpring.business.abstracts.JobTitleService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.ErrorResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.JobTitleDao;
import com.seyitucar.hrmsSpring.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll());
	}

	@Override
	public Result add(JobTitle jobTitle) {

		Result result = BusinessRules.run(existJobTitle(jobTitle.getTitleName()));

		if (result.isSuccess()) {
			this.jobTitleDao.save(jobTitle);
			return new SuccessResult("Pozisyon adı eklendi");
		}
		return result;
	}

	private Result existJobTitle(String jobTitle) {
		if (this.jobTitleDao.findByTitleNameEquals(jobTitle) != null) {
			return new ErrorResult("Bu pozisyon ismi daha önce oluşturulmuştur");
		}
		return new SuccessResult();
	}

}
