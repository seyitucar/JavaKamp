package gameHubDemo;

import java.time.LocalDate;

import gameHubDemo.adapters.MernisServiceAdapter;
import gameHubDemo.business.abstracts.BaseUserManager;
import gameHubDemo.business.abstracts.DiscountService;
import gameHubDemo.business.abstracts.OrderService;
import gameHubDemo.business.abstracts.UserCheckService;
import gameHubDemo.business.concretes.DiscountManager;
import gameHubDemo.business.concretes.OrderManager;
import gameHubDemo.business.concretes.SteamUserManager;
import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;
import gameHubDemo.entities.concretes.Order;
import gameHubDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1,"Forza 5","Racing",200);
		Game game2 = new Game(2,"Witcher","RPG",150);
		
		User user1 = new User(1,"Seyit","Uçar","seyitucar","seyit@","12345",LocalDate.of(1987, 9, 9),"12345");
		User user2 = new User(2,"Zeynep","Uçar","zeynepucar","zeynep@","12345",LocalDate.of(2017, 5, 5),"3456789");
		
		Campaign campaign1 = new Campaign(1,"Hoþgeldin",5);
		Campaign campaign2 = new Campaign(2,"New Year",25);
		
		
		Order order1 = new Order(1,1,1,1,"0001",LocalDate.of(2021, 05, 05));
		Order order2 = new Order(1,2,2,2,"0001",LocalDate.of(2021, 04, 04));
		
		DiscountService discountService = new DiscountManager();
		
		OrderService orderService = new OrderManager(new DiscountManager());
		
		orderService.sale(user1, game2, campaign1, discountService);
		
		BaseUserManager userManager = new SteamUserManager(new MernisServiceAdapter());
		userManager.register(user1);

	}

}
