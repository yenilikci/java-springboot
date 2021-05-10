package business.abstracts;

import entities.concretes.User;

public interface ValidationService {

	boolean userValidation(User user);
	boolean validPasswordLength(String password);
	boolean validEmailFormat(String email);
	boolean validEmailUnique(String email);
	boolean validFullNameLength(String name,String surname);
}
