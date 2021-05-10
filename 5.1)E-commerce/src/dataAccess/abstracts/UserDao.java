package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void activation(User user);

	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	User getMailAndPassword(String mail, String password);

	List<User> getAll();

}
