package eCommerceDemo.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserValidation implements ValidationService  {
	
	private UserDao userDao;
	

	public UserValidation(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public boolean validate(User user) {
		
		String email = user.getEmail();
		String emailRegex = "([A-Za-z-_\\.]+)@([A-Za-z-]+)\\.([A-Za-z]{2,})";
		
		if(!Pattern.matches(emailRegex, email)) {
			System.out.println("L�tfen ge�erli bir e-posta adresi giriniz.");
			return false;
		}
		
		if(user.getPassword().length()<6) {
			System.out.println("Parolan�z en az 6 haneli olmal�d�r");
			return false;
		}
		
		if(user.getFirstName().length()<2) {
			System.out.println("�sminiz en az 2 karakter olmal�d�r");
			return false;
		}
		
		if(user.getLastName().length()<2) {
			System.out.println("Soyisminiz en az 2 karakter olmal�d�r");
			return false;
		}
		
		
		List<User> users = userDao.getAll();
		
		for(User u:users) {
			if(u.getEmail() == user.getEmail()) {
				System.out.println("Bu email ile daha �nce �yelik olu�turulmu�tur");
				return false;
			}
		}
		
		return true;
	}
	
}
