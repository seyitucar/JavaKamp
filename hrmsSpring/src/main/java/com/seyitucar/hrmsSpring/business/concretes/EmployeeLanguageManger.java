package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.business.abstracts.EmployeeLanguageService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.EmployeeLanguageDao;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeLanguage;

@Service
public class EmployeeLanguageManger implements EmployeeLanguageService{

	private EmployeeLanguageDao employeeLanguageDao;
	
	@Autowired
	public EmployeeLanguageManger(EmployeeLanguageDao employeeLanguageDao) {
		super();
		this.employeeLanguageDao = employeeLanguageDao;
	}

	@Override
	public Result add(EmployeeLanguage employeeLanguage) {
		this.employeeLanguageDao.save(employeeLanguage);
		return new SuccessResult("Dil bilgisi eklendi");
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getAll() {
		return new SuccessDataResult<List<EmployeeLanguage>>(this.employeeLanguageDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getAllByEmployeeId(int employeeId) {
		return new SuccessDataResult<List<EmployeeLanguage>>(this.employeeLanguageDao.findAllByEmployeeId(employeeId));
	}

}
