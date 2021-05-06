package day4task2.business.abstracts;

import day4task2.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
