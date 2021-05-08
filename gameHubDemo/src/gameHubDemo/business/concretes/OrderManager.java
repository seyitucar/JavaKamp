package gameHubDemo.business.concretes;

import gameHubDemo.business.abstracts.DiscountService;
import gameHubDemo.business.abstracts.OrderService;
import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;
import gameHubDemo.entities.concretes.User;

public class OrderManager implements OrderService {

	DiscountService discountService;

	public OrderManager(DiscountService discountService) {
		this.discountService = discountService;
	}

	@Override
	public void sale(User user, Game game, Campaign campaign) {
		
		System.out.println(user.getFirstName() + " "+ game.getName() + " oyununu " + campaign.getName() +
				" kampanyas� ile " + discountService.calculateDiscount(game, campaign) + " TL fiyat�na ald�n�z " + "Oyunun orj. fiyat�: " + game.getPrice()+ " TL");
	}
	

}
