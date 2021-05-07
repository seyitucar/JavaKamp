package gameHubDemo.dataAccess.concretes;

import gameHubDemo.dataAccess.abstracts.UserDao;
import gameHubDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println("Hibarnate ile kayýt olundu : " + user.getFirstName());		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibarnate ile silindi : " + user.getFirstName());				
	}

	@Override
	public void update(User user) {
		System.out.println("Hibarnate ile güncelendi: " + user.getFirstName());				
	}
	
	
}
