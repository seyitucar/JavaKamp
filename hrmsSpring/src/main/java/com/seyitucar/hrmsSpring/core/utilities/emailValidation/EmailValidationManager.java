package com.seyitucar.hrmsSpring.core.utilities.emailValidation;

import org.springframework.stereotype.Service;

@Service
public class EmailValidationManager implements EmailValidationService {

	@Override
	public void sendVerificationMail(String email) {	
		System.out.println("Doğrulama maili gönderildi: " +email);
	}

	@Override
	public boolean isMailAddressVerified(String email) {
		System.out.println("Mail doğrulandı: " +email);
		return true;
	}

}
