package com.seyitucar.hrmsSpring.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.adapters.UserCheckService;
import com.seyitucar.hrmsSpring.business.abstracts.EmployeeService;
import com.seyitucar.hrmsSpring.core.utilities.results.ErrorResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.EmployeeDao;
import com.seyitucar.hrmsSpring.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	private UserCheckService userCheckService;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, UserCheckService userCheckService) {
		super();
		this.employeeDao = employeeDao;
		this.userCheckService = userCheckService;
	}

	@Override
	public Result register(Employee employee) {
		if(this.userCheckService.checkIfRealPerson(employee)==true) {
			this.employeeDao.save(employee);
			return new SuccessResult("Employee Eklendi");
		} else {
			return new ErrorResult("Kullanıcı bilgileri hatalı");
		}
	}

}
