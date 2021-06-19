package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.ImageService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageService imageService;
	
	@Autowired
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Image image) {
		return this.imageService.add(image);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	
	@GetMapping("/getAllByEmployeeId")
	DataResult<List<Image>> getAllByEmployeeId(@RequestParam int employeeId){
		return this.imageService.getAllByEmployeeId(employeeId);
	}

}
