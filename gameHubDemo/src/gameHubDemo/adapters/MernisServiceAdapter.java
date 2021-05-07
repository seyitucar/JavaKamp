package gameHubDemo.adapters;

import gameHubDemo.business.abstracts.UserCheckService;
import gameHubDemo.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();		
		try{
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
