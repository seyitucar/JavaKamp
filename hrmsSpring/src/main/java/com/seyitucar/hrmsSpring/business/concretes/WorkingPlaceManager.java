package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.business.abstracts.WorkingPlaceService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.WorkingPlaceDao;
import com.seyitucar.hrmsSpring.entities.concretes.WorkingPlace;

@Service
public class WorkingPlaceManager implements WorkingPlaceService {

	private WorkingPlaceDao workingPlaceDao;
	
	@Autowired
	public WorkingPlaceManager(WorkingPlaceDao workingPlaceDao) {
		super();
		this.workingPlaceDao = workingPlaceDao;
	}

	@Override
	public Result add(WorkingPlace workingPlace) {
		this.workingPlaceDao.save(workingPlace);
		return new SuccessResult("Çalışma yeri bilgisi eklendi");
	}

	@Override
	public DataResult<List<WorkingPlace>> getAll() {
		return new SuccessDataResult<List<WorkingPlace>>(this.workingPlaceDao.findAll());
	}

}
