package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.Gamer;
import Entities.User;

public class DefaultCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		return true;
	}

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		return true;
	}
	
}
