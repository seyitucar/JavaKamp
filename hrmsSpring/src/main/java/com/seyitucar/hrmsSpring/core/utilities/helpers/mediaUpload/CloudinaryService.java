package com.seyitucar.hrmsSpring.core.utilities.helpers.mediaUpload;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;

public interface CloudinaryService {
	
	DataResult<?> upload(MultipartFile file) throws IOException;
}
