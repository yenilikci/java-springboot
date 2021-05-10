package business.concretes;

import business.abstracts.ValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;
import java.util.regex.*;

public class ValidationManager implements ValidationService {

	static final Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private UserDao userDao;

	public ValidationManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean userValidation(User user) {
		if (validFullNameLength(user.getName(), user.getSurname()) && validEmailFormat(user.getEmail())
				&& validEmailUnique(user.getEmail()) && validPasswordLength(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validPasswordLength(String password) {
		if (password.length() < 6) {
			System.out.println("Þifreniz en az 6 karakter olmalýdýr");
			return false;
		} else
			return true;
	}

	@Override
	public boolean validEmailFormat(String email) {
		if (pattern.matcher(email).find() == true)
			return true;
		else
			return false;
	}

	@Override
	public boolean validEmailUnique(String email) {
		List<User> userList = userDao.getAll();
		for (User user : userList) {
			if (user.getEmail() == email) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean validFullNameLength(String name, String surname) {
		if (name.length() < 2) {
			System.out.println("Ýsim 2 karakterden fazla olmalý");
			return false;
		} else if (name.length() < 2) {
			System.out.println("Soyisim 2 karakterden fazla olmalý");
			return false;
		} else
			return true;
	}

}
