package concrete;

import Abstract.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi: " + campaign.getName());
		
	}

}
