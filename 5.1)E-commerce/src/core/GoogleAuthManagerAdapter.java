package core;

import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public void signIn(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.signIn(email, password);

	}

	@Override
	public void signUp(int id, String username, String name, String surname, String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.signUp(email, password);

	}

	@Override
	public boolean twoFactorAuth(String code) {
		if (code == "GOOGLE")
			return true;
		else
			return false;
	}

}
