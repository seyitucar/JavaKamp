package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.adapters.UserCheckService;
import com.seyitucar.hrmsSpring.business.BusinessRules;
import com.seyitucar.hrmsSpring.business.abstracts.EmployeeService;
import com.seyitucar.hrmsSpring.core.dataAccess.abstracts.UserDao;
import com.seyitucar.hrmsSpring.core.utilities.emailValidation.EmailValidationService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.ErrorResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.EmployeeDao;
import com.seyitucar.hrmsSpring.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	private UserCheckService userCheckService;
	private UserDao userDao;
	private EmailValidationService emailValidationService;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, EmailValidationService emailValidationService, UserDao userDao,
			UserCheckService userCheckService) {
		super();
		this.employeeDao = employeeDao;
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.emailValidationService = emailValidationService;
	}

	@Override
	public Result register(Employee employee) {

		Result result = BusinessRules.run(checkIfRealPerson(employee), existNationalityId(employee.getNationalityId()), existEmail(employee.getEmail()));

		if (result.isSuccess()) {
			this.employeeDao.save(employee);
			return new SuccessResult("Employee Eklendi");
		}
		return result;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	@Override
	public Result logIn(String email) {

		if (this.userDao.findByEmailEquals(email) == null) {
			return new SuccessResult("Kullan??c?? bulunamad??");
		}

		if (this.emailValidationService.isMailAddressVerified(email)) {
			return new SuccessResult("Email do??ruland??: " + email);
		} else {
			return new ErrorResult("L??tfen epostan??za gelen do??rulama linkine t??klay??n??z");
		}
	}

	private Result existEmail(String email) {
		if (this.userDao.findByEmailEquals(email) != null) {
			return new ErrorResult("Email adresi ile daha ??nce kay??t olu??turulmu??tur");
		}
		return new SuccessResult();
	}

	private Result existNationalityId(String nationalityId) {
		if (this.employeeDao.findByNationalityIdEquals(nationalityId) != null) {
			return new ErrorResult("TC No ile daha ??nce kay??t olu??turulmu??tur");
		}
		return new SuccessResult();
	}

	private Result checkIfRealPerson(Employee employee) {
		if (this.userCheckService.checkIfRealPerson(employee) == false) {
			return new ErrorResult("Kullan??c?? bilgileri hatal??");
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<Employee> findById(int id) {
		return new SuccessDataResult<Employee>(this.employeeDao.findById(id));
	}
}
