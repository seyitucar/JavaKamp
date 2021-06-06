package com.seyitucar.hrmsSpring.business.abstracts;

import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.User;

public interface UserService {
	Result add (User user);
}
