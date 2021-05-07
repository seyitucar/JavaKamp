package gameHubDemo.business.concretes;

import gameHubDemo.business.abstracts.DiscountService;
import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;

public class DiscountManager implements DiscountService {

	@Override
	public double calculateDiscount(Game game, Campaign campaign) {
		
		double newPrice = game.getPrice() - ((game.getPrice()*campaign.getDiscountRate())/100);
		 	
		return newPrice;
			
	}

}
