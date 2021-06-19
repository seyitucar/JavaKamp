package com.seyitucar.hrmsSpring.business.concretes;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.seyitucar.hrmsSpring.business.abstracts.ImageService;
import com.seyitucar.hrmsSpring.core.utilities.helpers.mediaUpload.CloudinaryService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.ErrorDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.ErrorResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessDataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.dataAccess.abstracts.ImageDao;
import com.seyitucar.hrmsSpring.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{
	
	private ImageDao imageDao;
	private CloudinaryService cloudinaryService;

	@Autowired
	public ImageManager(ImageDao imageDao, CloudinaryService cloudinaryService ) {
		super();
		this.imageDao = imageDao;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public Result add(MultipartFile file, Image image) throws IOException {
		
		Map<String, String> getImage = (Map<String,String>)cloudinaryService.upload(file).getData();
		image.setUrl(getImage.get("url"));
		image.setUploadedAt(LocalDate.now());
		
		var result = this.imageDao.save(image);
		
		if(result != null) {
			return new SuccessResult("Media başarı ile yüklendi");
		}

		return new ErrorResult("Hata! Media yüklenemedi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		var result = this.imageDao.findAll();
		
		if(result != null) {
			return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
		}	
		return new ErrorDataResult<List<Image>>("Hata! Fotoğraflar getirilemedi.");
	}

	@Override
	public DataResult<List<Image>> getAllByEmployeeId(int employeeId) {
		
		var result = this.imageDao.findAllByEmployeeId(employeeId);
		
		if(result != null) {
			return new SuccessDataResult<List<Image>>(this.imageDao.findAllByEmployeeId(employeeId));
		}
		return new ErrorDataResult<List<Image>>("Hata! Fotoğraflar getirilemedi.");
	}
}
