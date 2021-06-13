package com.seyitucar.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.business.BusinessRules;
import com.seyitucar.hrmsSpring.business.abstracts.EmployerService;
import com.seyitucar.hrmsSpring.core.dataAccess.abstracts.UserDao;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.ErrorResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.core.utilities.verificationCode.VerificationCodeService;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.EmployerDao;
import com.seyitucar.hrmsSpring.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private UserDao userDao;
	private VerificationCodeService verificationCodeService;

	@Autowired
	public EmployerManager(EmployerDao employerDao,UserDao userDao,VerificationCodeService verificationCodeService) {
		super();
		this.employerDao = employerDao;
		this.userDao = userDao;
		this.verificationCodeService = verificationCodeService;
	}

	@Override
	public Result register(Employer employer) {
		
		Result result = BusinessRules.run(existEmail(employer.getEmail()),checkWebAddress(employer.getWebsite(),employer.getEmail())); 

		if(result.isSuccess()) {
			this.employerDao.save(employer);
			this.verificationCodeService.sendVerificationCode(employer.getEmail());
			return new SuccessResult("Employer eklendi :" + employer.getCompanyName());	
		}
		
		return result;
	}
	
	private Result checkWebAddress(String website, String email) {
		
		String domain = email.split("@")[1];
		
		if(!website.contains(domain)) {
			return new ErrorResult("Email adresi website domaini ile örtüşmüyor");
		}
		
		return new SuccessResult();
	}
	
	private Result existEmail(String email) {
		if (this.userDao.findByEmailEquals(email)!=null) {
			return new ErrorResult("Email adresi ile daha önce kayıt oluşturulmuştur");
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

}
