package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;
import Entities.User;

public interface UserCheckService {
	
	boolean CheckIfRealPerson(User user);

	boolean CheckIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;
	
}
