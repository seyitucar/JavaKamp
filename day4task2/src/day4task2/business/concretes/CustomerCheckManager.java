package day4task2.business.concretes;

import day4task2.business.abstracts.CustomerCheckService;
import day4task2.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
		
	}

}
