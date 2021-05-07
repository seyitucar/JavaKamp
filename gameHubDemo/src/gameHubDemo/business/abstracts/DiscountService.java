package gameHubDemo.business.abstracts;

import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;

public interface DiscountService {
	
	double calculateDiscount(Game game, Campaign campaign);

}
