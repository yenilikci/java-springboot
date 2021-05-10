package business.concretes;

import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import core.AuthService;
import entities.concretes.User;

public class AuthManager implements AuthService {

	private ValidationService validationService;
	private UserService userService;
	private EmailService emailService;

	public AuthManager(ValidationService validationService, UserService userService, EmailService emailService) {
		super();
		this.validationService = validationService;
		this.userService = userService;
		this.emailService = emailService;
	}

	@Override
	public void signIn(String email, String password) {
		User signInUser = userService.getMailAndPassword(email, password);
		if (signInUser == null) {
			System.out.println("Mail veya þifreniz yanlýþ");
		} else if (!validationService.userValidation(signInUser)) {
			System.out.println("Doðrulama hatasý bilgilerinizi kontrol ediniz");
		}
		System.out.println(signInUser.getEmail() + " mail adresini kullanarak baþarýyla giriþ yaptýn!");
	}

	@Override
	public void signUp(int id, String username, String name, String surname, String email, String password) {
		User signUpUser = new User(id, username, name, surname, email, password, false);
		if (!validationService.userValidation(signUpUser)) {
			System.out.println("Doðrulama hatasý. Lütfen bilgilerinizi kontrol ediniz");
		} else if (!(validationService.validEmailUnique(email))) {
			System.out.println("Baþka bir email adresi kullanýnýz");
		} else {
			userService.add(signUpUser);
			System.out.println("Kullanýcý oluþturma iþlemi baþarýlý");
		}
	}

	@Override
	public boolean twoFactorAuth(String code) {
		if (code == "GOOGLE")
			return true;
		else
			return false;
	}

}
