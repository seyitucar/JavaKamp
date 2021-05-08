package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthenticationService;
import eCommerceDemo.entities.concretes.User;

public class EmailAuthentication implements AuthenticationService {

	@Override
	public void send(User user) {
		System.out.println(user.getEmail() + " mail adresinize do�rulama maili g�nderilmi�tir. Kayd�n�z� tamamlamak i�in l�tfen onaylay�n�z.");
		
	}

}
