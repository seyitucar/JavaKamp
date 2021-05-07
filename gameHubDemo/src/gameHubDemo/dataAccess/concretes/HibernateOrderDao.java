package gameHubDemo.dataAccess.concretes;

import java.util.List;

import gameHubDemo.dataAccess.abstracts.OrderDao;
import gameHubDemo.entities.concretes.Campaign;
import gameHubDemo.entities.concretes.Game;
import gameHubDemo.entities.concretes.Order;
import gameHubDemo.entities.concretes.User;

public class HibernateOrderDao implements OrderDao {

	@Override
	public void add(Game game, User user, Campaign campaign) {
		System.out.println("Hibarnate ile eklendi : " + game.getName() + user.getFirstName() + campaign.getName());		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Hibarnate ile silindi : " + order.getOrderNumber());
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Hibarnate ile güncellendi : " + order.getOrderNumber());
		
	}

	@Override
	public Order get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
