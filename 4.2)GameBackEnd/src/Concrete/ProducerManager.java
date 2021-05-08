package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class ProducerManager extends BaseUserManager{
	
	UserCheckService _checkService;

	public ProducerManager(UserCheckService checkService) {
		_checkService = checkService;
	}

	@Override
	public void save(User user) throws Exception {
		if(_checkService.CheckIfRealPerson(user))
		{
			super.save(user); 
		}else {
			throw new Exception("Böyle birisi yok");
		}
	}
	
}
