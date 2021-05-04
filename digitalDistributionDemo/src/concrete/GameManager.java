package concrete;

import Abstract.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme başarıyla eklendi: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun başarıyla silindi: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun başarıyla güncellendi: " + game.getName());
		
	}

}
