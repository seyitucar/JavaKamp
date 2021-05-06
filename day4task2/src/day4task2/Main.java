package day4task2;

import java.time.LocalDate;

import day4task2.adapters.MernisServiceAdapter;
import day4task2.business.abstracts.BaseCustomerManager;
import day4task2.business.concretes.StarbucksCustomerManager;
import day4task2.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Seyit","Uçar","11878195774",LocalDate.of(1987,12,9)));
		

	}

}
