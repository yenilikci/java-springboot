package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void save(Campaign entity) {
		System.out.println(entity.getName() + " kampanyası eklendi");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getName() + " kampanyası güncellendi");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getName() + " kampanyası silindi");
		
	}
	
}
