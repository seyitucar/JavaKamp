package gameHubDemo.business.abstracts;

import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;
import gameHubDemo.entities.concretes.User;

public interface OrderService {
	
	void sale (User user, Game game, Campaign campaign);

}
