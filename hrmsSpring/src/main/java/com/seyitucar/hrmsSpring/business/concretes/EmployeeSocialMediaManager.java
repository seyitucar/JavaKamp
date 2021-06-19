package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.business.abstracts.EmployeeSocialMediaService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.EmployeeSocialMediaDao;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeSocialMedia;

@Service
public class EmployeeSocialMediaManager implements EmployeeSocialMediaService {
	
	private EmployeeSocialMediaDao employeeSocialMediaDao;

	@Autowired
	public EmployeeSocialMediaManager(EmployeeSocialMediaDao employeeSocialMediaDao) {
		super();
		this.employeeSocialMediaDao = employeeSocialMediaDao;
	}

	@Override
	public Result add(EmployeeSocialMedia employeeSocialMedia) {
		this.employeeSocialMediaDao.save(employeeSocialMedia);
		return new SuccessResult("Kullanıcı sosyal medya bilgisi eklendi");
	}

	@Override
	public DataResult<List<EmployeeSocialMedia>> getAll() {
		return new SuccessDataResult<List<EmployeeSocialMedia>>(this.employeeSocialMediaDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeSocialMedia>> getAllByEmployeeId(int employeeId) {
		return new SuccessDataResult<List<EmployeeSocialMedia>>(this.employeeSocialMediaDao.findAllByEmployeeId(employeeId));
	}

}
