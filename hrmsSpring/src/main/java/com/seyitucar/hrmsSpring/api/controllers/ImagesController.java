package com.seyitucar.hrmsSpring.api.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.seyitucar.hrmsSpring.business.abstracts.ImageService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.core.utilities.results.SuccessResult;
import com.seyitucar.hrmsSpring.entities.concretes.Employee;
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
	public Result add(@RequestBody MultipartFile file, @RequestParam int employeeId) throws IOException{
		
		Image image = new Image();
		Employee employee = new Employee();
		
		employee.setId(employeeId);
		image.setEmployee(employee);
	
		return this.imageService.add(file, image);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Image image) {
		
		return this.imageService.delete(image);
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
