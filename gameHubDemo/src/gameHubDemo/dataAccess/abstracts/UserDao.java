package gameHubDemo.dataAccess.abstracts;

import gameHubDemo.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void delete(User user);
	void update(User user);

}
