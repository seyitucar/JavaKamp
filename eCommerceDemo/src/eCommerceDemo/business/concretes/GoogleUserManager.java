package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.BaseUserManager;

public class GoogleUserManager extends BaseUserManager {

	@Override
	public void login(String email, String password) {

		super.login(email, password);
		System.out.println(email + " Google ile giriþ yaptýnýz");
	}
}
