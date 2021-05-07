package gameHubDemo.dataAccess.abstracts;

import java.util.List;

import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;
import gameHubDemo.entities.concretes.Order;
import gameHubDemo.entities.concretes.User;

public interface OrderDao {
	
	void add(Game game, User user, Campaign campaign);
	void delete (Order order);
	void update (Order order);
	Order get(int id);
	List<Order> getAll();

}
