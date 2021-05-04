package concrete;

import Abstract.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme baþarýyla eklendi: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun baþarýyla silindi: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun baþarýyla güncellendi: " + game.getName());
		
	}

}
