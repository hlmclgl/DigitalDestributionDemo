package concrete;

import Abstract.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme ba�ar�yla eklendi: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun ba�ar�yla silindi: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar�yla g�ncellendi: " + game.getName());
		
	}

}
