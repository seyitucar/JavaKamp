package gameHubDemo.business.concretes;


import gameHubDemo.business.abstracts.BaseUserManager;
import gameHubDemo.business.abstracts.UserCheckService;
import gameHubDemo.entities.concretes.User;

public class SteamUserManager extends BaseUserManager {
	
	UserCheckService userCheckService;
	
	public SteamUserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void register(User user) {
		
		if(userCheckService.checkIfRealPerson(user)) {
			
			super.register(user);
			
		} else
			
		System.out.println("Not a valid person");
	}

}
