package core;

public interface AuthService {

	void signIn(String email, String password);

	void signUp(int id, String username, String name, String surname, String email, String password);

	boolean twoFactorAuth(String code);

}
