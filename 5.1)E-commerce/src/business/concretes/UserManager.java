package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void activation(User user) {
		userDao.activation(user);
	}

	@Override
	public void add(User user) {
		userDao.add(user);

	}

	@Override
	public void update(User user) {
		userDao.update(user);

	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public boolean isActive(User user) {
		System.out.println(user.getUsername() + " kullanýcý aktif edildi");
		return true;
	}

	@Override
	public User getMailAndPassword(String mail, String password) {
		return userDao.getMailAndPassword(mail, password);
	}
	
	

}
