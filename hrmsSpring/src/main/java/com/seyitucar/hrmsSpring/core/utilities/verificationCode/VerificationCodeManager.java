package com.seyitucar.hrmsSpring.core.utilities.verificationCode;

import org.springframework.stereotype.Service;

@Service
public class VerificationCodeManager implements VerificationCodeService {

	@Override
	public boolean sendVerificationCode(String email) {
		return true;
	}

}
