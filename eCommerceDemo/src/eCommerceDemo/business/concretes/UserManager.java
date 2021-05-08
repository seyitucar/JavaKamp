package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthenticationService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.core.LoginService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidationService validationService;
	private AuthenticationService authenticationService;
	private LoginService loginService;

	public UserManager(UserDao userDao, ValidationService validationService,
			AuthenticationService authenticationService, LoginService loginService) {
		super();
		this.userDao = userDao;
		this.validationService = validationService;
		this.authenticationService = authenticationService;
		this.loginService = loginService;
	}
	

	@Override
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
				
				loginService.loginToSystem("Google ile giri� yap�ld�.");
				System.out.println("Ba�ar�l� bir �ekilde giri� yapt�n�z.");
				
			}else if(!user.getEmail().contains(email)) {
				
				System.out.println("Kullan�c� kayd�n�z bulunamad�.");
				
			} else {
				System.out.println("Kullan�c� ad�n�z veya parolanz hatal�.");
			}		
		}	
	}

}
