package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService{

	@Override
	public void save(User user) throws Exception {
		System.out.println(user.getUserName() + " kullanýcýsý kayýt edildi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " kullanýcýsý güncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " kullanýcý silindi");
		
	}
	
}
