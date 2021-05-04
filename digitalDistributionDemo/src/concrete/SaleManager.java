package concrete;

import Abstract.SaleService;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName() + "kullan�c�s� " + game.getName() + "oyununu sat�n ald�.");
		
	}

	
}
