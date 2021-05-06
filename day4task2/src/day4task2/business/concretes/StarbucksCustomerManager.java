package day4task2.business.concretes;

import day4task2.business.abstracts.BaseCustomerManager;
import day4task2.business.abstracts.CustomerCheckService;
import day4task2.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
			
		} else
			
		throw new Exception("Not a valid person");
	}

}
