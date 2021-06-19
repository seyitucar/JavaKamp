package com.seyitucar.hrmsSpring.business.abstracts;

import java.util.List;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.SocialMedia;

public interface SocialMediaService {

	Result add(SocialMedia socialMedia);
	DataResult<List<SocialMedia>> getAll();
}
