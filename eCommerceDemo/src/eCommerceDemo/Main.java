package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.EmailAuthentication;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.UserValidation;
import eCommerceDemo.core.GoogleLoginManagerAdapter;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
    
		User user1 = new User(1,"Seyit","Uçar","1234567","seyit@seyit.com");
		User user2 = new User(2,"Zeynep","Uçar","123452","zeynep@zeynep.com");
		
		UserDao userDao = new HibernateUserDao();
				
		
		UserService userService = new UserManager(new HibernateUserDao(), new UserValidation(userDao),
				new EmailAuthentication(), new GoogleLoginManagerAdapter());

		
		userDao.add(user1);		
		
		System.out.println("--------------------------");
	
		userService.register(user2);
		
		System.out.println("--------------------------");
		
		userService.login(user2.getEmail(), user2.getPassword());
		
		System.out.println("--------------------------");
		
		userService.login(user2.getEmail(), "123456");
		
		System.out.println("--------------------------");	

	}

}
