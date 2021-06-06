package com.seyitucar.hrmsSpring.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.seyitucar.hrmsSpring.entities.concretes.Employee;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(Employee employee) {
		
		/*
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = false;	
		
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(employee.getNationalityId()),
					employee.getFirstName().toUpperCase(new Locale("tr")),
					employee.getLastName().toUpperCase(new Locale("tr")),
					employee.getBirthYear().getYear());
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
			
		return result;
		*/
		
		return true;
	}

}
