package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService{

	@Override
	public void save(User user) throws Exception {
		System.out.println(user.getUserName() + " kullanıcısı kayıt edildi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " kullanıcısı güncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " kullanıcı silindi");
		
	}
	
}
