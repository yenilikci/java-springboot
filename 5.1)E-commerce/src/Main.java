import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import core.AuthService;
import core.GoogleAuthManagerAdapter;
import dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao());

		AuthService authService = new AuthManager(new ValidationManager(new HibernateUserDao()), userService,
				new EmailManager());

		EmailService emailService = new EmailManager();

		authService.signUp(1, "mcelik", "Melih", "Çelik", "melih@mail.com", "123456");

		emailService.emailSending(userService.get(1));

		userService.activation(userService.get(1));

		authService.signUp(2, "mmc", "Melih M", "Çelik", "melih@maail.com", "1234567"); // hatalý

		// emailService.emailSending(userService.get(2));

		// userService.activation(userService.get(2));

		authService.signUp(3, "mcelikk", "M Melih", "Celik", "newmail@mail.com", "123"); // hatalý

		// emailService.emailSending(userService.get(3));

		// userService.activation(userService.get(3));

		authService.signIn("melih@mail.com", "123456");

		AuthService googleAuthService = new GoogleAuthManagerAdapter();

		googleAuthService.signUp(3, "mcelikx", "Melih", "Çelik", "melihx@mail.com", "123456789");

		googleAuthService.signIn("melihx@mail.com", "123456789");

	}

}
