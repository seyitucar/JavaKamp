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
			System.out.println("Kaydýnýz tamamlanamadý");
		}
	}
	
	
	@Override
	public void login(String email, String password) {
				
		for(User user:userDao.getAll()) {
			
			if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
				
				loginService.loginToSystem("Google ile giriþ yapýldý.");
				System.out.println("Baþarýlý bir þekilde giriþ yaptýnýz.");
				
			}else if(!user.getEmail().contains(email)) {
				
				System.out.println("Kullanýcý kaydýnýz bulunamadý.");
				
			} else {
				System.out.println("Kullanýcý adýnýz veya parolanz hatalý.");
			}		
		}	
	}

}
