package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class MysqlUserDao implements UserDao {

	List<User> userList = new ArrayList<User>();

	@Override
	public void activation(User user) {
		System.out.println(user.getUsername() + " hesabýn hibernate ile aktive edildi");
	}

	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println(user.getUsername() + " hesabýn hibernate ile oluþturuldu");
	}

	@Override
	public void update(User user) {
		User updateUser = get(user.getId());
		updateUser.setName(user.getName());
		updateUser.setUsername(user.getSurname());
		updateUser.setPassword(user.getPassword());
		System.out.println(user.getUsername() + " hesabýn hibernate ile güncellendi");
	}

	@Override
	public void delete(User user) {
		userList.remove(user.getId());
		System.out.println(user.getUsername() + " hesabýn hibernate ile silindi");
	}

	@Override
	public User get(int id) {
		for (User user : userList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public User getMailAndPassword(String mail, String password) {
		for(User user : userList)
		{
			if(user.getEmail() == mail && user.getPassword() == password)
			{
				return user;
			}
		}
		return null;
	}
	
	
}
