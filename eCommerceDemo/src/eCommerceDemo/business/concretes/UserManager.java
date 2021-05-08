package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthenticationService;
import eCommerceDemo.business.abstracts.BaseUserManager;
import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager extends BaseUserManager{
	
	private UserDao userDao;
	private ValidationService validationService;
	private AuthenticationService authenticationService;


	public UserManager(UserDao userDao, AuthenticationService authenticationService, ValidationService validationService ) {
		super();
		this.userDao = userDao;
		this.authenticationService = authenticationService;
		this.validationService = validationService;
	}	



	public void register(User user) {
		
		if(validationService.validate(user)) {
			authenticationService.send(user);
			userDao.add(user);
		} else {
			System.out.println("Kayd�n�z tamamlanamad�");
		}
	}
	
	
	@Override
	public void login(String email, String password) {
				
		for(User user:userDao.getAll()) {
			
			if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
				
				System.out.println("Ba�ar�l� bir �ekilde giri� yapt�n�z.");
				
			}else if(!user.getEmail().contains(email)) {
				
				System.out.println("Kullan�c� kayd�n�z bulunamad�.");
				
			} else {
				System.out.println("Kullan�c� ad�n�z veya parolanz hatal�.");
			}		
		}	
	}

}
