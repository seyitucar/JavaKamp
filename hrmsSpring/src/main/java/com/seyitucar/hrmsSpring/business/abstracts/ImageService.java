package com.seyitucar.hrmsSpring.business.abstracts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Image;


public interface ImageService {
	
	Result add(MultipartFile file, Image image) throws IOException;
	Result delete(Image image);
	DataResult<List<Image>> getAll();
	DataResult<List<Image>> getAllByEmployeeId(int employeeId);
}
