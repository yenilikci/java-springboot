package business.abstracts;

import entities.concretes.User;

public interface EmailService {

	void emailSending(User user);
	
}
