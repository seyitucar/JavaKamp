package com.seyitucar.hrmsSpring.core.utilities.emailValidation;

public interface EmailValidationService {	
	public void sendVerificationMail(String email);
	public boolean isMailAddressVerified(String email);
}
