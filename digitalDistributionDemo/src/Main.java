import java.util.Date;

import adapters.MernisServiceAdaptor;
import concrete.CampaignManager;
import concrete.SaleManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.Sale;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setUserId(1);
		user.setFirstName("Ahmet Hilmi");
		user.setLastName("Çiloðlu");
		user.setEmail("hlmclgl@gmail.com");
		user.setBirthYear("2000");
		user.setNationalityId("10000000000");
		user.setPassword("12345");
		
		
		Game game = new Game(1,"CS:GO","Prime Statüs",100);
		
		Campaign campaign = new Campaign(1,1,"Bahar Ýndirimi","%30",new Date());
		
		Sale sale = new Sale(1,1,1,1);
		
		UserManager userManager = new UserManager(new MernisServiceAdaptor());
		//userManager.add(user);
		//userManager.delete(user);
		userManager.update(user);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(user, game);
		
	}

}
