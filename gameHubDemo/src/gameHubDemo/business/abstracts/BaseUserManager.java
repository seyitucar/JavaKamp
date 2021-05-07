package gameHubDemo.business.abstracts;

import gameHubDemo.entities.concretes.User;

public class BaseUserManager implements UserService {

	@Override
	public void register(User user) {
		
		System.out.println("Registered to system " + user.getFirstName());
		
	}

}
