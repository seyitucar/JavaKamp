package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.EmployeeSocialMediaService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeSocialMedia;

@RestController
@RequestMapping("/api/employeesocialmedias")
public class EmployeeSocialMediasController {

	private EmployeeSocialMediaService employeeSocialMediaService;
	
	@Autowired
	public EmployeeSocialMediasController(EmployeeSocialMediaService employeeSocialMediaService) {
		super();
		this.employeeSocialMediaService = employeeSocialMediaService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeSocialMedia employeeSocialMedia) {
		return this.employeeSocialMediaService.add(employeeSocialMedia);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<EmployeeSocialMedia>> getAll(){
		return this.employeeSocialMediaService.getAll();
	}
	
	@GetMapping("/getAllByEmployeeId")
	DataResult<List<EmployeeSocialMedia>> getAllByEmployeeId(@RequestParam int employeeId){
		return this.employeeSocialMediaService.getAllByEmployeeId(employeeId);
	}
}
