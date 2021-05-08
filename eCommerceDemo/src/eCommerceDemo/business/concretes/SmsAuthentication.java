package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthenticationService;
import eCommerceDemo.entities.concretes.User;

public class SmsAuthentication implements AuthenticationService {

	@Override
	public void send(User user) {
		System.out.println(user.getFirstName()+ " telefonunuza do�rulama kodu g�nderilmi�tir. Kayd�n�z� tamamlamak i�in l�tfen kodu giriniz.");
		
	}

}
