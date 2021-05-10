package business.concretes;

import business.abstracts.EmailService;
import entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void emailSending(User user) {
		System.out.println(user.getEmail() + " mail adresinize doðrulama maili yollandý");
	}
	
}
