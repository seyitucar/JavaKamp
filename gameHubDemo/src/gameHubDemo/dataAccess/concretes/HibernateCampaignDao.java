package gameHubDemo.dataAccess.concretes;

import java.util.List;

import gameHubDemo.dataAccess.abstracts.CampaignDao;
import gameHubDemo.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Hibarnate ile eklenddi : " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Hibarnate ile silindi : " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Hibarnate ile güncelledi : " + campaign.getName());
		
	}

	@Override
	public Campaign get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
