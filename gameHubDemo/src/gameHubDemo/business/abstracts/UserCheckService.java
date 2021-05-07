package gameHubDemo.business.abstracts;

import gameHubDemo.entities.concretes.User;

public interface UserCheckService {
	
	boolean checkIfRealPerson(User user);

}
