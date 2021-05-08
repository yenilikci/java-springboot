package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.Gamer;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		return true;
	}

	// Oyuncu için kimlik kontrolü
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()), gamer.getFirstName().toUpperCase(),
				gamer.getLastName().toUpperCase(), gamer.getDateOfBirthYear());
	}

}
