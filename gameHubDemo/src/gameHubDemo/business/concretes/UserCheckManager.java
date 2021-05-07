package gameHubDemo.business.concretes;

import gameHubDemo.business.abstracts.UserCheckService;
import gameHubDemo.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {

		return false;
	}

}
