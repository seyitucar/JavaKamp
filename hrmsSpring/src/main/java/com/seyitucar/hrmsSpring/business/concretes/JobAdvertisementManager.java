package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.business.abstracts.JobAdvertisementService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.JobAdvertisementDao;
import com.seyitucar.hrmsSpring.entities.concretes.JobAdvertisement;
import com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getByActivity(boolean activityStatus) {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdvertisementDao.getByActivity(activityStatus));
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getByActivityOrderByApplicationDeadline(boolean activityStatus) {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdvertisementDao.getByActivityOrderByApplicationDeadline(activityStatus));
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getByActivityOrderByApplicationDeadlineDesc(boolean activityStatus) {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdvertisementDao.getByActivityOrderByApplicationDeadlineDesc(activityStatus));
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getByActivityAndCompanyName(boolean activityStatus,String companyName) {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdvertisementDao.getByActivityAndCompanyName(activityStatus,companyName));
	}

	@Override
	public Result setStatus(int jobAdvertisementId, int employerId, boolean status) {	
		
		List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.getByEmployerId(employerId);
	
		for(JobAdvertisement jobAdvertisement:jobAdvertisements) {
			if(jobAdvertisementId == jobAdvertisement.getId()) {
				jobAdvertisement.setActive(status);
				this.jobAdvertisementDao.save(jobAdvertisement);
				return new SuccessResult("Statü değiştirildi");
			}
		}
		
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployerId(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByEmployerId(employerId));
	}
}
