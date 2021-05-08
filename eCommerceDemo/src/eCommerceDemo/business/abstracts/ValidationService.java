package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface ValidationService {
	
	boolean validate(User user);

}
