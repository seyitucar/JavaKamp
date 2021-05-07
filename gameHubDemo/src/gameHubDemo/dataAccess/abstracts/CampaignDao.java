package gameHubDemo.dataAccess.abstracts;

import java.util.List;
import gameHubDemo.entities.concretes.Campaign;

public interface CampaignDao {

	void add(Campaign campaign);
	void delete (Campaign campaign);
	void update (Campaign campaign);
	Campaign get(int id);
	List<Campaign> getAll();
}
