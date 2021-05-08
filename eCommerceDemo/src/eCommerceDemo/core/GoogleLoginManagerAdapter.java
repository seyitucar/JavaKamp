package eCommerceDemo.core;

import eCommerceDemo.googleLogin.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements LoginService {

	@Override
	public void loginToSystem(String message) {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.login(message);		
	}

}
