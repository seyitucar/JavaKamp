package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private ArrayList<User> users;

	public HibernateUserDao() {
		
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate ile eklendi " + user.getFirstName());		
	}

	@Override
	public void delete(User user) {
		
		if(users.contains(user)) {
			users.remove(user);
			System.out.println("Hibernate ile silindi " + user.getFirstName());
		} else {
			System.out.println("Kullan�c� bulunamad�");
		}			
	}

	@Override
	public void update(User user) {
		
		if(users.contains(user)) {
			System.out.println("Hibernate ile g�ncellendi " + user.getFirstName());
		} else {
			System.out.println("Kullan�c� bulunamad�");
		}			
	}

	@Override
	public List<User> getAll() {
					
		return users;
	}

}
