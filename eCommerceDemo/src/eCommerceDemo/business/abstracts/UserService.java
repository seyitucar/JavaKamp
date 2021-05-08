package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	
	public void register(User user);
	
	public void login(String email, String password);

}
