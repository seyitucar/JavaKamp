package gameHubDemo.dataAccess.abstracts;

import java.util.List;

import gameHubDemo.entities.concretes.Game;

public interface GameDao {
	
	void add(Game game);
	void delete (Game game);
	void update (Game game);
	Game get(int id);
	List<Game> getAll();
	
}
