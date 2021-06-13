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
			return new SuccessResult("Kullanıcı bulunamadı");
		}

		if (this.emailValidationService.isMailAddressVerified(email)) {
			return new SuccessResult("Email doğrulandı: " + email);
		} else {
			return new ErrorResult("Lütfen epostanıza gelen doğrulama linkine tıklayınız");
		}
	}

	private Result existEmail(String email) {
		if (this.userDao.findByEmailEquals(email) != null) {
			return new ErrorResult("Email adresi ile daha önce kayıt oluşturulmuştur");
		}
		return new SuccessResult();
	}

	private Result existNationalityId(String nationalityId) {
		if (this.employeeDao.findByNationalityIdEquals(nationalityId) != null) {
			return new ErrorResult("TC No ile daha önce kayıt oluşturulmuştur");
		}
		return new SuccessResult();
	}

	private Result checkIfRealPerson(Employee employee) {
		if (this.userCheckService.checkIfRealPerson(employee) == false) {
			return new ErrorResult("Kullanıcı bilgileri hatalı");
		}
		return new SuccessResult();
	}
}
