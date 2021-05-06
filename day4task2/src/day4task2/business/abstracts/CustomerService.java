package day4task2.business.abstracts;

import day4task2.entities.concretes.Customer;

public interface CustomerService {
	
	void save (Customer customer) throws Exception;

}
