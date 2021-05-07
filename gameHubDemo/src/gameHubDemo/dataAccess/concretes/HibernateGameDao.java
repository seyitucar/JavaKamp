package gameHubDemo.dataAccess.concretes;

import java.util.List;

import gameHubDemo.dataAccess.abstracts.GameDao;
import gameHubDemo.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Hibarnate ile eklenddi : " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Hibarnate ile silindi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Hibarnate ile güncellendi : " + game.getName());
		
	}

	@Override
	public Game get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
