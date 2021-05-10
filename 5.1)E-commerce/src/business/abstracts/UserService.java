package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	void activation(User user);

	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	User getMailAndPassword(String mail, String password);

	List<User> getAll();

	boolean isActive(User user);
}
